package com.collectionHW_4;

import java.util.HashMap;
import java.util.Map;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Map<Integer, Patient> patients = new HashMap<>();

        Patient p1 =new Patient(1001,"shakti",87,"shirdi");
        Patient p2=new Patient(1003,"shiv",78,"rahata");
        Patient p3=new Patient(1006,"parvati",99,"pune");
        Patient p4=new Patient(1002,"suresh",67,"karve");

        patients.put(p1.getPatientId(),p1);
        patients.put(p2.getPatientId(), p2);
        patients.put(p3.getPatientId(),p3);
        patients.put(p4.getPatientId() ,p4);

        System.out.println("patient details:");
        for (Patient p:patients.values()) {
            System.out.println(p);

        }
        int searchId = 1002;
        if (patients.containsKey(searchId)) {
            System.out.println("Search Result for Patient ID " + searchId + ": " + patients.get(searchId));
        } else {
            System.out.println("Patient with ID " + searchId + " not found.");
        }


    }

}
