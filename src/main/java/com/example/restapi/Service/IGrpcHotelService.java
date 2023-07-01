package com.example.restapi.Service;

import com.example.restapi.grpc.HotelService;

public interface IGrpcHotelService {
    HotelService.ListHotel getListHotel(HotelService.RequestMessageHotel requestMessageHotel);
}
