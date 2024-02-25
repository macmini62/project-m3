package com.projectma3.Ma3.Matatu;

import com.projectma3.Ma3.Parent.TravelDetails;

public class Matatu extends TravelDetails {
    public Integer capacity;
    public String Driver;

    public Matatu(Long id, String plate, String name){
        super(id,plate,name);
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getPlate(){
        return plate;
    }

    public void setPlate(String plate){
        this.plate=plate;
    }
}
