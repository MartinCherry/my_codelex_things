package io.codelex.arithmetic.practice;

public class Exercise_06 {
    public static void main(String[] args) {

        int startNum = 1;
        int maxNum = 110;
        boolean isTxt = false;

        for (int i = startNum; i<=maxNum; i++) {
            isTxt = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                isTxt = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                isTxt = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                isTxt = true;
            }
            if (!isTxt) {
                System.out.print(i);
            }
            System.out.print(" ");

            if (i % 11 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
