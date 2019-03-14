package com.javacodegeeks.encapsulation.hidenamesetter;

public class EmployeeExample {

    public static void main(String[] args) {
        Employee emp = new Employee("Keith Henderson");
        emp.setSalary(50000);
        emp.setBonus(3000);
        emp.setDepartment("Engineering");
        
        System.out.printf("%s belongs to the %s department earning an annual salary of $%d with bonus $%d",
                emp.getName(), emp.getDepartment(), emp.getSalary(), emp.getBonus());
    }
}
