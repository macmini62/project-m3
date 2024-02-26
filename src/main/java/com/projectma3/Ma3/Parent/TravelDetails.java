package com.projectma3.Ma3.Parent;

import java.time.LocalTime;

public class TravelDetails {
    protected Long id;
    protected String name;
    protected String plate;
    protected String source = "Chuka";
    protected String destination = "Nairobi";
    protected LocalTime depature = LocalTime.now();
    protected LocalTime arrival = LocalTime.now();

    public TravelDetails(Long id, String name, String plate) {
        this.id=id;
        this.name=name;
        this.plate=plate;
    }

    public TravelDetails(Long id,String plate){
        this.id=id;
        this.plate=plate;
    }

    public TravelDetails(String name){
        this.name=name;
    }

}
