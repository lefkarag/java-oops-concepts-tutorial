package com.javacodegeeks.abstractinterface;

public class Employee implements EmployeeInterface {

    private String name;
    private double salary;
    private double bonus;
    private String department;
    private String role;

    public Employee(String name, double salary, String department, String role) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.role = role;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void giveBonus() {
        this.bonus = salary * 0.2;
    }
    
    @Override
    public String toString() {
        return getName() + " is a " + getRole() + " at the " + getDepartment()
                + " department earning an annual salary of $" + salary + " with bonus $" + getBonus();
    }

}