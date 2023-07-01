package com.example.restapi.controller;

import com.example.restapi.Service.GrpcHotelService;
import com.example.restapi.Service.IGrpcHotelService;
import com.example.restapi.grpc.GetBookedGrpc;
import com.example.restapi.grpc.HotelService;
import com.example.restapi.grpc.HotelService.ResponseHotel;
import com.example.restapi.entities.Flight;
import com.example.restapi.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.io.StringWriter;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    @Autowired
    private IGrpcHotelService grpcHotelService;

    @GetMapping("/test")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping
    public String getAll() {
        List<Flight> flights = FlightRepository.getAll();

        HotelService.RequestMessageHotel request = HotelService.RequestMessageHotel.newBuilder().build();
        
        HotelService.ListHotel listHotel = grpcHotelService.getListHotel(request);
        List<ResponseHotel> responseHotels = listHotel.getListHotelList();
        
        JSONArray hotelArray = new JSONArray();
        for (ResponseHotel hotel : responseHotels) {
            JSONObject hotelJson = new JSONObject();
            hotelJson.put("name", hotel.getName());
            hotelJson.put("description", hotel.getDescription());
            hotelJson.put("rate", hotel.getRate());
            hotelArray.put(hotelJson);
        }

        try {
            JAXBContext jcFlight = JAXBContext.newInstance(Flight[].class);
            JAXBElement<Flight[]> rootFlight = new JAXBElement<Flight[]>( new QName("flights"), 
                                                                Flight[].class, 
                                                                flights.toArray(new Flight[flights.size()])
                                                            );
            Marshaller marshallerFlight = jcFlight.createMarshaller();
            marshallerFlight.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter writerFlight = new StringWriter();
            marshallerFlight.marshal(rootFlight, writerFlight);
            
            JSONObject flightJson = XML.toJSONObject(writerFlight.toString());

            JSONObject combinedJson = new JSONObject();
            combinedJson.put("flights", flightJson.getJSONObject("flights").getJSONArray("item"));
            combinedJson.put("hotels", hotelArray);
            
            return combinedJson.toString(4);  
        } catch (JAXBException|JSONException e) {
            throw new RuntimeException(e);
        }

    }

}
