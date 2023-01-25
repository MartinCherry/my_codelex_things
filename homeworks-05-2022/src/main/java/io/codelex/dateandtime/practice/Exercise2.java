package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise2 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter server start date");
        LocalDate serverStartDay = LocalDate.parse(in.nextLine());

        System.out.println("Enter year for test: ");
        int yearForTest = Integer.parseInt(in.nextLine());

        System.out.println("Enter month for test: ");
        int monthForTest = Integer.parseInt(in.nextLine());

        LocalDate tempDate = serverStartDay;

        while (!tempDate.minusMonths(1).isAfter(createDate(yearForTest, monthForTest))) {
            if ((tempDate.getMonth().equals(createDate(yearForTest, monthForTest).getMonth())) &&
                    (tempDate.getYear() == (createDate(yearForTest, monthForTest).getYear()))) {
                System.out.println(tempDate);
            }
            tempDate = tempDate.plusDays(14);
        }
    }

    private static LocalDate createDate(int year, int month) {
        return LocalDate.of(year, month, 1);
    }
}
