package com.projectma3.Ma3.Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/driver")
public class DriverController {
    @Autowired
    private final DriverService driverService;

    public DriverController(DriverService driverService){
        this.driverService=driverService;
    }

    @GetMapping
    public List<Driver> getDriver(){
        return  driverService.getDriver();
    }

}
