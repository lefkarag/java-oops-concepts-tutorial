package com.javacodegeeks.abstractinterface;

public class EmployeeExample {

    public static void main(String[] args) {
        EmployeeInterface emp = new Employee("Keith Henderson", 50000, "Engineering", "Backend Developer");
        emp.giveBonus();

        System.out.println(emp);
    }
}
