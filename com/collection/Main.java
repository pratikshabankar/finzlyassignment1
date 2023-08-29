package com.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        City c1 = new City("rahata");
        City c2 = new City("Loni");
        City c3 = new City("savalivihir");
        City c4 = new City("Shirdi");

        City c5 = new City("Wagholi");
        City c6 = new City("uruli kanchan");
        City c7 = new City("nandedCity");
        City c8 = new City("Baner");
        City c9 = new City("karvenagar");

        City c10=new City("Venmankondan");
        City c11=new City("Pudukudi");
        City c12=new City("Nagalkuli");

        City c13=new City("Agaram");
        City c14=new City("Chinnamadurapakkam");
        City c15=new City("Kalakattur");

        District district1 = new District("Ahmednagar");
        district1.addCity(c1);
        district1.addCity(c2);
        district1.addCity(c3);
        district1.addCity(c4);

        District district2 = new District("Pune");
        district2.addCity(c5);
        district2.addCity(c6);
        district2.addCity(c7);
        district2.addCity(c8);
        district2.addCity(c9);

        District district3=new District("Ariyalur");
        district3.addCity(c10);
        district3.addCity(c11);
        district3.addCity(c12);

        District district4=new District("Kancheepuram");
        district4.addCity(c13);
        district4.addCity(c14);
        district4.addCity(c15);

        State state1 = new State("Maharashtra");
        state1.addDistrict(district1);
        state1.addDistrict(district2);

        State state2=new State("Tamil Nadu");
        state2.addDistrict(district3);
        state2.addDistrict(district4);

        State state3=new State("Gujarat");
        State state4=new State("Goa");
        State state5=new State("Punjab");



        Country country1 = new Country("India");
        country1.addState(state1);
        country1.addState(state2);
        country1.addState(state3);
        country1.addState(state4);
        country1.addState(state5);

        Country country2 = new Country("United States");
        Country country3 = new Country("Russia");

        System.out.println(country1.getStates());

        System.out.println(state1.getDistricts());
        System.out.println(state2.getDistricts());
        System.out.println(state3.getDistricts());
        System.out.println(state4.getDistricts());

        System.out.println(district1.getCities());
        System.out.println(district2.getCities());

        System.out.println(district3.getCities());
        System.out.println(district4.getCities());


    }
}
