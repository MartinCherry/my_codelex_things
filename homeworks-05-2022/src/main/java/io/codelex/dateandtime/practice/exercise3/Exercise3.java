package io.codelex.dateandtime.practice.exercise3;

import java.time.LocalDate;

public class Exercise3 {
    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);


        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        LocalDate thirdStart = LocalDate.of(2022, 1, 2);
        LocalDate thirdEnd = LocalDate.of(2022, 1, 13);
        DatePeriod thirdPeriod = new DatePeriod(thirdStart, thirdEnd);


        DatePeriod overlapOneTwo = firstPeriod.intersection(secondPeriod);
        DatePeriod overlapOneThree = firstPeriod.intersection(thirdPeriod);

        System.out.println(overlapOneTwo);
        System.out.println(overlapOneThree);
    }

}
