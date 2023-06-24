package com.example.restapi.repositories;

import com.example.restapi.entities.Company;
import com.example.restapi.entities.Date;
import com.example.restapi.entities.Flight;
import com.example.restapi.entities.Seat;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class FlightRepository {

    public static List<Flight> getAll() {
        List<Flight> flights = new ArrayList<Flight>();
        Seat p1 = new Seat(1, "4B");
        Seat p2 = new Seat(2, "12");
        Seat p3 = new Seat(3, "2C");

        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd");
        isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date d1, d2, d3;

        try {
            d1 = new Date(isoFormat.parse("2023-06-01"), isoFormat.parse("2023-06-05"));
            d2 = new Date(isoFormat.parse("2023-06-03"), isoFormat.parse("2023-06-05"));
            d3 = new Date(isoFormat.parse("2023-04-01"), isoFormat.parse("2023-07-18"));
        } catch(ParseException e) {
            return flights;
        }

        Company c1 = new Company(1, "Asian Air");
        Company c2 = new Company(2, "America Airlines");
        Company c3 = new Company(3, "Space X");

        Flight v1 = new Flight(10427489, c1, p1, d1);
        Flight v2 = new Flight(27481947, c1, p2, d2);
        Flight v3 = new Flight(37047498, c2, p2, d3);
        Flight v4 = new Flight(42074937, c2, p3, d1);
        Flight v5 = new Flight(54279123, c3, p1, d2);
        Flight v6 = new Flight(64208429, c3, p3, d3);
        
        flights.add(v1);
        flights.add(v2);
        flights.add(v3);
        flights.add(v4);
        flights.add(v5);
        flights.add(v6);
        return flights;
    }
}