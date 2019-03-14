package com.javacodegeeks.simple;

public class EmployeeExample {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Keith Henderson";
        emp.salary = 50000;
        emp.bonus = 3000;
        emp.department = "Engineering";
        
        System.out.printf("%s belongs to the %s department earning an annual salary of $%d with bonus $%d",
                emp.name, emp.department, emp.salary, emp.bonus);
    }
}
