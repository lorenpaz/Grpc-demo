package com.lorenzo.boat.rest;

import com.lorenzo.boat.api.Boat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
