package com.javacodegeeks.inheritance;

public class Director extends Employee {

    public Director(String name) {
        super(name, "Director");
    }

    @Override
    public void giveBonus() {
        this.bonus = getSalary() * 0.5;
    }

}