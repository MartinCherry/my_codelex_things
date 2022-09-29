package io.codelex.oop.practice.exercise5;

public class MeasurementConverter {
    public static double covert(int number, ConversionType conversionType) {
        double result;
        switch (conversionType) {
            case METERS_TO_YARDS:
                result = number * 1.0936;
                break;
            case YARDS_TO_METERS:
                result = number * 0.9144;
                break;
            case CENTIMETERS_TO_INCHES:
                result = number / 2.54;
                break;
            case INCHES_TO_CENTIMETERS:
                result = number * 2.54;
                break;
            case KILOMETERS_TO_MILES:
                result = number * 0.621371;
                break;
            case MILES_TO_KILOMETERS:
                result = number / 0.621371;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
