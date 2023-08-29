package com.collection;


import java.util.HashMap;

public class Country {
    private String countryName;


    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                '}';
    }

    HashMap<String,State>states=new HashMap<>();

    public void addState(State state){
        states.put(state.toString(),state);
    }
    public HashMap<String,State>getStates(){
        return states;
    }
}

