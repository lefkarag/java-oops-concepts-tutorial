package com.javacodegeeks.composition;

public class Employee {

    private Identity identity;
    private String name;
    private int salary;
    private String department;

    public Identity getIdentity() {
        return identity;
    }
    
    public void setIdentity(Identity identity) {
        this.identity = identity;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

}