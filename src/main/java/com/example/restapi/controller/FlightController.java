package com.example.restapi.controller;

import com.example.restapi.entities.Flight;
import com.example.restapi.repositories.FlightRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import org.json.JSONException;
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

    @GetMapping("/test")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping
    public String getAll() {
        List<Flight> flights = FlightRepository.getAll();
        try {
            JAXBContext jc = JAXBContext.newInstance(Flight[].class);
            JAXBElement<Flight[]> root = new JAXBElement<Flight[]>( new QName("flights"), 
                                                                Flight[].class, 
                                                                flights.toArray(new Flight[flights.size()])
                                                            );
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter writer = new StringWriter();
            marshaller.marshal(root, writer);
            return XML.toJSONObject(writer.toString()).toString(4);  
        } catch (JAXBException|JSONException e) {
            throw new RuntimeException(e);
        }

    }

}
