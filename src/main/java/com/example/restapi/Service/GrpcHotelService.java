package com.example.restapi.Service;

import com.example.restapi.Configuration.GrpcConfig;
import com.example.restapi.grpc.GetBookedGrpc;
import com.example.restapi.grpc.HotelService;
import com.google.protobuf.Field;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import io.grpc.Channel;

@Service
public class GrpcHotelService implements IGrpcHotelService {
    private final GetBookedGrpc.GetBookedBlockingStub blockingStub;
    @Autowired
    private Environment environment;
    public GrpcHotelService() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(GrpcConfig.class);
        blockingStub = ctx.getBean(GetBookedGrpc.GetBookedBlockingStub.class);
    }
    
    public HotelService.ListHotel getListHotel(HotelService.RequestMessageHotel requestMessageHotel) {
        return blockingStub.getBookedHotel(requestMessageHotel);
    }
}
