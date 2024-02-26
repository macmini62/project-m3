package com.projectma3.Ma3.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/passenger")
public class PassengerController {
    @Autowired
    private final PassengerService passengerService;

    public PassengerController(PassengerService passengerService){
    this.passengerService=passengerService;
    }

    @GetMapping
    public List<Passenger> getPassenger(){
        return passengerService.getPassenger();
    }


}
