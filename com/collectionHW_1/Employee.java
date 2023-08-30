package com.collectionHW_1;

public class Employee {
    Employee(){

    }
    private int id;
    private String department;
    private long salary;

    public Employee(int id, String department, long salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

}
