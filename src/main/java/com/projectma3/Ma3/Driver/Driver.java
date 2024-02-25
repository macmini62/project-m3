package com.projectma3.Ma3.Driver;

import com.projectma3.Ma3.Parent.TravelDetails;

public class Driver extends TravelDetails {
    public Driver(Long id, String name, String plate) {
        super(id, name, plate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }


}
