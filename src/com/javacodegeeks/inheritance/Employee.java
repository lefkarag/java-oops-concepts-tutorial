package com.javacodegeeks.inheritance;

public class Employee {

    private final String name;
    protected double salary;
    protected double bonus;
    protected String department;
    private final String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
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

    public double getBonus() {
        return bonus;
    }

    public void giveBonus() {
        this.bonus = salary * 0.2;
    }

    @Override
    public String toString() {
        return getName() + " is a " + getRole() + " at the " + getDepartment()
                + " department earning an annual salary of $" + salary + " with bonus $" + getBonus();
    }

}