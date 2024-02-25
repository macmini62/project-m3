package com.projectma3.Ma3.Driver;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    public List<Driver> getDriver(){
        return List.of(
                new Driver(
                        1L,
                        "Dere",
                        "KBQ528J"
                )
        );
    };
}
