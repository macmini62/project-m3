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

    public TravelDetails(Object o, String name, String plate) {
    }

}
