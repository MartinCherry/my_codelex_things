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

        while (!tempDate.minusMonths(1).isAfter(LocalDate.of(yearForTest, monthForTest, 1))) {
            if ((tempDate.getMonth().equals(LocalDate.of(yearForTest, monthForTest, 1).getMonth())) && (tempDate.getYear() == (LocalDate.of(yearForTest, monthForTest, 1).getYear()))) {
                System.out.println(tempDate);
            }
            tempDate = tempDate.plusDays(14);
        }


    }
}
