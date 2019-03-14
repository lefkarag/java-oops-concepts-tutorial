package com.javacodegeeks.abstractdefaultinterface;

public class EmployeeExample {

    public static void main(String[] args) {
        EmployeeInterface emp = new Employee("Keith Henderson", 50000, "Engineering", "Backend Developer");
        System.out.println(emp);
    }
}
