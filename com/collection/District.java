package com.collection;


import java.util.ArrayList;

public class District {
    private String districtName;

    public District(String districtName) {
        this.districtName = districtName;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtName='" + districtName + '\'' +
                '}';
    }

    ArrayList<City> cities=new ArrayList<>();

    public void addCity(City city){
        cities.add(city);
    }
    public ArrayList<City>getCities(){
        return  cities;
    }


}

