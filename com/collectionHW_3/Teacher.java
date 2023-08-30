package com.collectionHW_3;

 class Teacher extends Person {
     private int EmployeeId;

     public Teacher(String name, int age, int employeeId) {
         super(name, age);
         EmployeeId = employeeId;
     }

     public int getEmployeeId() {
         return EmployeeId;
     }

     @Override
     public String toString() {
         return super.toString()+" Teacher{" +
                 "EmployeeId=" + EmployeeId +
                 '}';
     }
 }
