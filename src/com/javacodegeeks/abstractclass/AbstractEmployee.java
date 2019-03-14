package com.javacodegeeks.abstractclass;

public abstract class AbstractEmployee {
    
    private static final double BONUS_PERCENTAGE = 0.2;

    abstract String getName();

    abstract double getSalary();

    abstract String getDepartment();

    double getBonus() {
        return calcBonus();
    }

    String getRole() {
        return "Employee";
    }
    
    private double calcBonus() {
        return getSalary() * BONUS_PERCENTAGE;
    }

}