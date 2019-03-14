package com.javacodegeeks.inheritance;

public class DirectorExample {

    public static void main(String[] args) {
        Employee emp = new Employee("Keith Henderson", "Backend Developer");
        emp.setSalary(50000);
        emp.setDepartment("Engineering");
        emp.giveBonus();

        Employee dir = new Director("Tori Hicks");
        dir.setSalary(150000);
        dir.setDepartment("Engineering");
        dir.giveBonus();

        System.out.println(emp);
        System.out.println(dir);
    }
}