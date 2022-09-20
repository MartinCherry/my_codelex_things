package io.codelex.arrays.practice;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};


//        fixme - calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }


//        fixme - calculate average value
        double average = (double) sum / numbers.length;
        System.out.printf("Average value of the array elements is : %.2f", average);

    }
}
