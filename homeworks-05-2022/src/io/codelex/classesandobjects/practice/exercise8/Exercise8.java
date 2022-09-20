package io.codelex.classesandobjects.practice.exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double depositTotal = 0;
        double withdrawnTotal = 0;
        double interestsTotal = 0;

        System.out.print("How much money is in the account?: ");
        int input = Integer.parseInt(in.nextLine());
        SavingsAccount balance = new SavingsAccount(input);
        System.out.print("Enter the annual interest rate: ");
        double rate = Double.parseDouble(in.nextLine());
        System.out.print("How long has the account been opened? ");
        int opened = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= opened; i++) {
            System.out.print("Enter amount deposited for month " + i + " : ");
            int deposited = Integer.parseInt(in.nextLine());
            balance.deposit(deposited);
            System.out.print("Enter amount withdrawn for month " + i + " : ");
            int withdrawn = Integer.parseInt(in.nextLine());
            balance.withdrawal(withdrawn);
            depositTotal += deposited;
            withdrawnTotal += withdrawn;
            interestsTotal += balance.monthlyInterests(rate);
        }

        System.out.printf("Total deposited: $%.2f \n", depositTotal);
        System.out.printf("Total withdrawn: $%.2f \n", withdrawnTotal);

        System.out.printf("Interest earned: $%.2f \n", interestsTotal);
        System.out.printf("In account: $%.2f \n", balance.getAccountBalance());


    }

}
