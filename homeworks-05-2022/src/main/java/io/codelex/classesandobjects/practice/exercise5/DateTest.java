package io.codelex.classesandobjects.practice.exercise5;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(16, 7, 1989);

        System.out.println(date1.displayDate());
        date1.setDay(20);
        System.out.println(date1.displayDate());
        date1.setMonth(8);
        System.out.println(date1.displayDate());
        date1.setYear(1999);
        System.out.println(date1.displayDate());
    }
}
