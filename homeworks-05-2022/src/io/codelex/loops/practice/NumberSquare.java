package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter MIN number: ");
        int min = Integer.parseInt(input.nextLine());
        System.out.print("Please enter MAX number: ");
        int max = Integer.parseInt(input.nextLine());
        while (max <= min) {
            System.out.println("MAX number can't be less than or equal to MIN number.");
            System.out.print("Please enter MAX number: ");
            max = Integer.parseInt(input.nextLine());
        }

        for (int i = min; i <= max; i++)
        {
            int n = i;

            for (int a = min; a <= max; a++)
            {
                System.out.print(n);
                n++;
                if (n > max)
                    n = min;
            }
            System.out.println();
        }


    }

}
