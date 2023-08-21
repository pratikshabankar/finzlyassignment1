package ConstructorsInJava;

 class Student {

         private int studentId;
         private String name;
         private int age;

         // to generate uid
         private static int id= 10;

         public Student() {
             studentId = 0;
             name = "Unknown";
             age = 0;
         }

         public Student(String name, int age) {


             this.studentId = ++id;
             this.name = name;
             this.age = age;
         }

         public Student(int studentId, String name, int age) {

             this.studentId = studentId;
             this.name = name;
             this.age = age;
         }

         @Override
         public String toString() {
             return "Student Id " + this.studentId + " name " + this.name + " age " + this.age;
         }

     }


