package io.codelex.arrays.practice;

public class Exercise4 {

    //TODO: Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] myArray = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
        int checkFor = 1245;

        boolean foundIt = false;
//        fixme - check if contains number 1245
        for (int num : myArray) {
            if (num == checkFor) {
                foundIt = true;
                break;
            }
        }
        System.out.println(foundIt ? "Contains" : "There is not such number");
    }
}
