package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise_09 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Please choose 'metric' or 'imperial' system: ");
        String metricOrImperial = input.nextLine();

        while (!metricOrImperial.equals("metric") && !metricOrImperial.equals("imperial")) {
            System.out.print("Please write only 'metric' or 'imperial': ");
            metricOrImperial = input.nextLine();
        }

    if (metricOrImperial.equals("imperial")) {

        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();

        double bmi =(weight * 703 / height);

        if (bmi < 18.5) {
            System.out.printf("Your BMI is: %.2f. You are underweight", bmi);
        } else if (bmi > 25) {
            System.out.printf("Your BMI is: %.2f. You are overweight", bmi);
        } else {
            System.out.printf("Your BMI is: %.2f. You are perfect!", bmi);

        }
    }
    else if (metricOrImperial.equals("metric")) {

        System.out.print("Enter your mass in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in cm: ");
        double height = input.nextDouble();

        double bmi = ((weight / height / height) * 10000);

        if (bmi < 18.5) {
            System.out.printf("Your BMI is: %.2f. You are underweight", bmi);
        } else if (bmi > 25) {
            System.out.printf("Your BMI is: %.2f. You are overweight", bmi);
        } else {
            System.out.printf("Your BMI is: %.2f. You are perfect!", bmi);

        }
    }


    }


}
