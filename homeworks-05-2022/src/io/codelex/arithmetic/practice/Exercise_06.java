package io.codelex.arithmetic.practice;

public class Exercise_06 {
    public static void main(String[] args) {

        int startNum = 1;
        int maxNum = 110;

        //Find for numbers
        for (int i = startNum; i <= maxNum; i++) {
            String addition = "";
            if (i % 3 == 0) {
                addition += "Coza";
            }
            if (i % 5 == 0) {
                addition += "Loza";
            }
            if (i % 7 == 0) {
                addition += "Woza";
            }

            //PrintOut
            if (addition.equals("")) {
                System.out.print(i);
            } else {
                System.out.print(addition);
            }
            System.out.print(" ");

            if (i % 11 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
