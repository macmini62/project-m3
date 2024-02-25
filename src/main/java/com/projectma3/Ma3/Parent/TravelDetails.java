package com.projectma3.Ma3.Parent;

import java.time.LocalTime;

public class TravelDetails {

       protected Long id;

       protected String name;
       protected String plate;
        public  String source = "Chuka";
        public String destination = "Nairobi";
        public LocalTime depature = LocalTime.now();
        public LocalTime arrival = LocalTime.now();

    public TravelDetails(Long id, String name, String plate) {
        this.id=id;
        this.name=name;
        this.plate=plate;
    }

    public TravelDetails(Long id,String plate){
        this.id=id;
        this.plate=plate;
    }

}
