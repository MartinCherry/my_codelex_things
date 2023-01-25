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


            if ((tempDate.getDayOfWeek() != DayOfWeek.SATURDAY) && (tempDate.getDayOfWeek() != DayOfWeek.SUNDAY)) {
                if (checkIfNotHoliday(tempDate)) {
                    hours += 8;
                }
                else {
                    holiday++;
                }
            }
            else {
                weekend++;
            }

            tempDate = tempDate.plusDays(1);
        }
        System.out.println("Weekend " + weekend);
        System.out.println("Holidays " + holiday);

        return hours;
    }

    private static boolean checkIfNotHoliday(LocalDate tempDate) {

        // Official holidays
        LocalDate holiday4ofMay = LocalDate.of(tempDate.getYear(), 5, 4);
        LocalDate holyDay18ofNovember = LocalDate.of(tempDate.getYear(), 11, 18);
        LocalDate holidayMidsummerFestival1 = LocalDate.of(tempDate.getYear(), 6, 23);
        LocalDate holidayMidsummerFestival2 = LocalDate.of(tempDate.getYear(), 6, 24);
        LocalDate holidayChristmas1 = LocalDate.of(tempDate.getYear(), 12, 24);
        LocalDate holidayChristmas2 = LocalDate.of(tempDate.getYear(), 12, 25);
        LocalDate holidayChristmas3 = LocalDate.of(tempDate.getYear(), 12, 26);

        if (tempDate.equals(holiday4ofMay)) {
            return false;
        }
        else if (tempDate.equals(holyDay18ofNovember)) {
            return false;
        }
        else if (tempDate.equals(holidayMidsummerFestival1)) {
            return false;
        }
        else if (tempDate.equals(holidayMidsummerFestival2)) {
            return false;
        }
        else if (tempDate.equals(holidayChristmas1)) {
            return false;
        }
        else if (tempDate.equals(holidayChristmas2)) {
            return false;
        }
        else {
            return !tempDate.equals(holidayChristmas3);
        }
    }

}
