package com.collectionHW_4;
import java.util.HashMap;
import java.util.Map;

public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String loc;

    public Patient(int patientId, String name, int age, String loc) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.loc = loc;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLoc() {
        return loc;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", loc='" + loc + '\'' +
                '}';
    }
}
