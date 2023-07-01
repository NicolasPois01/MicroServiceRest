package com.example.restapi;

import com.example.restapi.Service.GrpcHotelService;
import com.example.restapi.Service.IGrpcHotelService;
import com.example.restapi.grpc.HotelService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.Target;

@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }

}
