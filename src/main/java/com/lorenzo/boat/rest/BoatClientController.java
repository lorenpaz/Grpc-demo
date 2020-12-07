package com.lorenzo.boat.rest;

import com.lorenzo.boat.api.Boat;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@Slf4j
@RequiredArgsConstructor
public class BoatClientController {

    private final RestTemplate restTemplate;

    @GetMapping(value = "/api/client")
    public String boat() {
        Boat boat = restTemplate.getForObject("http://localhost:8080/api/boat", Boat.class);
        log.info("boat: captain {}, fuel {}, model {}, cargo {}", boat.getCaptain(), boat.getFuel(),boat.getModel(),boat.getCargo());
        return "boat received..";
    }

    @GetMapping(value = "/api/client/bytes")
    public byte[] boatBytes() {
        RequestEntity<byte[]> requestEntity = new RequestEntity<>(null, HttpMethod.GET,
        URI.create("http://localhost:8080/api/boat/"),
        byte[].class);
        RestTemplate restTemplateThatDoesNotKnowAboutProtobuf = new RestTemplate();
        ResponseEntity<byte[]> exchange = restTemplateThatDoesNotKnowAboutProtobuf
                .exchange(requestEntity, byte[].class);
        log.info("boat: Number of bytes {]", exchange.getBody());
        for(byte b : exchange.getBody()){
            log.info("Wow a byte: " + b);
        }
        return exchange.getBody();
    }

    @GetMapping(value = "/api/v2/client")
    public String boatVersionTwo() {
        Boat boat = restTemplate.getForObject("http://localhost:8080/api/v2/boat", Boat.class);
        log.info("boat: captain {}, fuel {}, model {}, cargo {}", boat.getCaptain(), boat.getFuel(),boat.getModel(),boat.getCargo());
        return "boat received..";
    }
}
