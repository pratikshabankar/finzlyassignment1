package com.collectionHW_3;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        List<Teacher> t =new ArrayList<>();

        Student student=new Student("vishal",20,1);
        Student student1=new Student("bhakti",23,2);
        Student student2=new Student("ganesh",26,9);



        Teacher teacher=new Teacher("bhujbal",30,11);
        Teacher teacher1=new Teacher("gaigol",35,15);
        Teacher teacher2=new Teacher("gadekar",48,17);



        s.add(student);
        s.add(student1);
        s.add(student2);

        System.out.println("Students Information: ");

        for (Student students:s) {
            System.out.println(students);

        }

        t.add(teacher);
        t.add(teacher1);
        t.add(teacher2);

        System.out.println("Teachers Information:");


        for (Teacher teachers:t) {
            System.out.println(teachers);

        }
    }
}
