package com.projectma3.Ma3.Matatu;

import com.projectma3.Ma3.Parent.TravelDetails;

public class Matatu extends TravelDetails {
    public Integer capacity;
    public String driver;

    public Matatu(Long id, String plate, Integer capacity, String driver){
        super(id,plate);
        this.capacity=capacity;
        this.driver=driver;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        driver = driver;
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
