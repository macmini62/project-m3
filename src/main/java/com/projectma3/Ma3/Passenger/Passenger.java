package com.projectma3.Ma3.Passenger;

import com.projectma3.Ma3.Parent.TravelDetails;

public class Passenger extends TravelDetails {
     private Integer fare;
     private String matatu;

     public Passenger(Integer fare, String name, String matatu){
         super(name);
         this.fare=fare;
         this.matatu=matatu;
     }

    public Integer getFare() {
        return fare;
    }

    public void setFare(Integer fare) {
        this.fare = fare;
    }

    public String getMatatu() {
        return matatu;
    }

    public void setMatatu(String matatu) {
        this.matatu = matatu;
    }

    public String getName(){
         return name;
    }

    public void setName(String name){
         this.name=name;
    }

}