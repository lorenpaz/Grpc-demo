package com.lorenzo.boat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Configuration
public class ProtobufConfig {

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter(){return new ProtobufHttpMessageConverter();}

    @Bean
    RestTemplate restTemplate(ProtobufHttpMessageConverter protobufHttpMessageConverter){
        return new RestTemplate(Arrays.asList(protobufHttpMessageConverter));
    }
}
