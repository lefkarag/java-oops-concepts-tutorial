package com.javacodegeeks.composition;

public class EmployeeExample {

    public static void main(String[] args) {
        Identity identity = new Identity();
        identity.setId("PA21673");

        Employee emp = new Employee();
        emp.setIdentity(identity);
        emp.setName("Keith Henderson");
        emp.setSalary(50000);
        emp.setDepartment("Engineering");

        System.out.println(emp);
    }
}
