package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise1 {

    public static void main(String[] args) {

        LocalDate startingDate = LocalDate.of(2020, 01, 01);
        LocalDate endDate = LocalDate.now();

        System.out.println(getHours(startingDate, endDate));
    }

    private static long getHours(LocalDate startingDate, LocalDate endDate) {
        LocalDate tempDate = startingDate;
        long hours = 0;
        long weekend = 0;
        long holiday = 0;


        while (!endDate.equals(tempDate)) {

            // Official hollidays
            LocalDate hollyday4ofMay = LocalDate.of(tempDate.getYear(), 5, 4);
            LocalDate hollyDay18ofNovember = LocalDate.of(tempDate.getYear(), 11, 18);
            LocalDate hollidayMidsommerFestival1 = LocalDate.of(tempDate.getYear(), 6, 23);
            LocalDate hollidayMidsommerFestival2 = LocalDate.of(tempDate.getYear(), 6, 24);
            LocalDate hollidayChristmas1 = LocalDate.of(tempDate.getYear(), 12, 24);
            LocalDate hollidayChristmas2 = LocalDate.of(tempDate.getYear(), 12, 25);
            LocalDate hollidayChristmas3 = LocalDate.of(tempDate.getYear(), 12, 26);

            if ((tempDate.getDayOfWeek() != DayOfWeek.SATURDAY) && (tempDate.getDayOfWeek() != DayOfWeek.SUNDAY)) {
                if ((!tempDate.equals(hollyday4ofMay)) && (!tempDate.equals(hollyDay18ofNovember)) && (!tempDate.equals(hollidayMidsommerFestival1)) && (!tempDate.equals(hollidayMidsommerFestival2)) && (!tempDate.equals(hollidayChristmas1)) && (!tempDate.equals(hollidayChristmas2)) && (!tempDate.equals(hollidayChristmas3))) {
                    hours += 8;
                } else {
                    holiday++;
                }
            } else {
                weekend++;
            }

            tempDate = tempDate.plusDays(1);
        }
        System.out.println("Weekend " + weekend);
        System.out.println("Holidays " + holiday);

        return hours;
    }

}
