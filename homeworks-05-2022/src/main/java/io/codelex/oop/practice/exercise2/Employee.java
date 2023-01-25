package io.codelex.oop.practice.exercise2;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private final String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, String age, String position, String startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = LocalDate.parse(startedWorking);
    }

    public int getWorkExperience() {

        return Period.between(this.startedWorking, LocalDate.now()).getYears();
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + position + " (" + getWorkExperience() + " years)";
    }
}
