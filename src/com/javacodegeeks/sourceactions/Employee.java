package com.javacodegeeks.sourceactions;

public class Employee {

    private String name;
    private double salary;
    private String department;
    private String role;
    
    public Employee(String name, double salary, String department, String role) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + ", role=" + role + "]";
    }

}