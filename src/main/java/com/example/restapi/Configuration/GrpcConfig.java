package com.example.restapi.Configuration;

import com.example.restapi.grpc.GetBookedGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {
    
    private String address;
    private int port;
    
    @Bean
    GetBookedGrpc.GetBookedBlockingStub getBookedBlockingStub(){
        ManagedChannel channel = NettyChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        return GetBookedGrpc.newBlockingStub(channel);
    }
}
