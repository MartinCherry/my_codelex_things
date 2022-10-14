package io.codelex.secondtest.exercise1;

import java.math.BigDecimal;

public class CardApp {
    public static void main(String[] args) {

        DebitCard debitCard = new DebitCard("1234", "Peter", "078");
        debitCard.addMoney(100);
        debitCard.addMoney(10000);
        debitCard.withdrawMoney(10000);
        debitCard.withdrawMoney(101);

        CreditCard creditCard = new CreditCard("4321", "John", "065");

        creditCard.addMoney(150);
        System.out.println(creditCard.accountBalance());
        creditCard.withdrawMoney(50);
        creditCard.withdrawMoney(100);
        creditCard.withdrawMoney(1);




    }
}
