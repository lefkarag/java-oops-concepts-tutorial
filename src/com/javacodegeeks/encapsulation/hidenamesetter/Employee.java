package com.javacodegeeks.encapsulation.hidenamesetter;

public class Employee {

    private final String name;
    private int salary;
    private int bonus;
    private String department;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getBonus() {
        return bonus;
    }
    
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

}