package com.javacodegeeks.aggregation;

public class EmployeeExample {

    public static void main(String[] args) {
        Department engineering = new Department();
        engineering.setName("Engineering");

        Employee emp = new Employee();
        emp.setName("Keith Henderson");
        emp.setSalary(50000);
        emp.setDepartment(engineering);

        System.out.println(emp);
    }
}
