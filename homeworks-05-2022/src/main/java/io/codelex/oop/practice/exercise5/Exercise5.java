package io.codelex.oop.practice.exercise5;

public class Exercise5 {
    public static void main(String[] args) {

        int distance = 20;
        ConversionType conversionType = ConversionType.METERS_TO_YARDS;

        System.out.println(MeasurementConverter.covert(distance, conversionType));

    }
}
