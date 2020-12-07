package com.lorenzo.boat.rest;

import com.lorenzo.boat.api.Boat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BoatRestController {

    @GetMapping(value = "/api/boat", produces = "application/x-protobuf")
    public Boat boat(){
        return Boat.newBuilder()
                .setCaptain("Mike")
                .setCargo(Boat.CargoType.FRUIT)
                .setModel("Pyramid")
                .setFuel(88)
                .build();
    }

    @GetMapping(value = "/api/v2/boat", produces = "application/x-protobuf")
    public Boat boatVersionTwo(){
        return Boat.newBuilder()
                .setCaptain(generateRandomString())
                .setCargo(Boat.CargoType.FRUIT)
                .setModel(generateRandomString())
                .setFuel(getRandomNumber(0,100))
                .build();
    }

    private String generateRandomString() {
        return new Random().ints(48, 122 + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(10)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
