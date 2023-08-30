package com.collectionHW_3;

 class Student  extends Person{
     private int studentId;



     public Student(String name, int age, int studentId) {
         super(name, age);
         this.studentId = studentId;
     }

     public int getStudentId() {
         return studentId;
     }

     @Override
     public String toString() {
         return super.toString()+ "Student{" +
                 "studentId=" + studentId +
                 '}';
     }
 }
