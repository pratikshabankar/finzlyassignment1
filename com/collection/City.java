package com.collection;


public class City{
    private String cityName;

    public City(String cityName){
        this.cityName=cityName;
    }



    @Override
    public String toString() {
        return "Cities{" +
                "cityName='" + cityName + '\'' +
                '}';
    }


}

