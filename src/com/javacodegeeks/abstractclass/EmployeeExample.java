package com.javacodegeeks.abstractclass;

public class EmployeeExample {

    public static void main(String[] args) {
        AbstractEmployee emp = new Employee("Keith Henderson", 50000, "Engineering", "Backend Developer");
        System.out.println(emp);
    }
}
