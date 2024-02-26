package com.projectma3.Ma3.Passenger;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassenger(){
        return List.of(
                new Passenger(
                        200,
                        "Mutembei",
                        "Airbus"
                )
        );
    }
}
