package com.example.restapi.controller;

import com.example.restapi.entities.Company;
import com.example.restapi.entities.Date;
import com.example.restapi.entities.Flight;
import com.example.restapi.entities.Seat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @GetMapping("/test")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping
    public List<Flight> getAll() {
        List<Flight> flights = new ArrayList<Flight>();
        Seat p1 = new Seat(1, "4B");
        Seat p2 = new Seat(2, "12");
        Seat p3 = new Seat(3, "2C");

        Date d1 = new Date(new java.util.Date(), new java.util.Date());
        Date d2 = new Date(new java.util.Date(), new java.util.Date());
        Date d3 = new Date(new java.util.Date(), new java.util.Date());

        Company c1 = new Company(1, "Asian Air");
        Company c2 = new Company(2, "America Airlines");
        Company c3 = new Company(3, "Space X");

        Flight v1 = new Flight(1, c1, p1, d1);
        Flight v2 = new Flight(2, c1, p2, d2);
        Flight v3 = new Flight(3, c2, p2, d3);
        Flight v4 = new Flight(4, c2, p3, d1);
        Flight v5 = new Flight(5, c3, p1, d2);
        Flight v6 = new Flight(6, c3, p3, d3);
        
        flights.add(v1);
        flights.add(v2);
        flights.add(v3);
        flights.add(v4);
        flights.add(v5);
        flights.add(v6);
        return flights;
    }

}
