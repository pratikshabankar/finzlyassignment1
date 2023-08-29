package com.collection;

import java.util.HashMap;

public class State {
    private String stateName;


    public State(String stateName){
        this.stateName=stateName;
    }

    public String getStateName() {
        return stateName;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateName='" + stateName + '\'' +
                '}';
    }

    HashMap<String,District>districts=new HashMap<>();

    public void addDistrict(District district){
        districts.put(district.toString(),district);
    }

    public HashMap<String,District>getDistricts(){
        return districts;
    }



}

