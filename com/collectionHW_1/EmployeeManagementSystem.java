package com.collectionHW_1;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employeerecords=new ArrayList<>();
        employeerecords.add(new Employee(1,"IT",68000));
        employeerecords.add(new Employee(2,"comp",55000));
        employeerecords.add(new Employee(3,"civil",40000));
        employeerecords.add(new Employee(4,"entc",45000));
        employeerecords.add(new Employee(5,"mechanical",55000));
        employeerecords.add(new Employee(6,"AI",75000));
        System.out.println("Employee details:");

        for (Employee e :employeerecords) {
            System.out.println(employeerecords);

        }
        int searchId =10;
        boolean found=false;
        for (Employee e:employeerecords) {
            if(e.getId()== searchId){
                System.out.println("Employee found :"+e);
                found=true;
                break;

            }


        }
        if(!found){
            System.out.println("Employee with ID :"+searchId+" not found");
        }

    }
}
