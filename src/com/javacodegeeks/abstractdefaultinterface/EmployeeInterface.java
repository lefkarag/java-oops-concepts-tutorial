package com.javacodegeeks.abstractdefaultinterface;

public interface EmployeeInterface {

    String getName();

    double getSalary();

    default double getBonus() {
        return getSalary() * 0.2;
    }

    String getDepartment();

    default String getRole() {
        return "Employee";
    }

}