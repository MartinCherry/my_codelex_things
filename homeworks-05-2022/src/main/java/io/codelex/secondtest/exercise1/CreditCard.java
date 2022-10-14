package io.codelex.secondtest.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card{


    public CreditCard(String cardNumber, String cardName, String ccv) {
        super(cardNumber, cardName, ccv);
    }

    @Override
    public void addMoney(double amount) {
        this.amount = this.amount.add(BigDecimal.valueOf(amount));
    }

    @Override
    public void withdrawMoney(double amount) {
        BigDecimal temp = this.amount.subtract(BigDecimal.valueOf(amount));
        if (BigDecimal.valueOf(0).compareTo(temp) > 0) {
            throw new NotEnoughFundsException();
        }
        else {
            if (BigDecimal.valueOf(100).compareTo(temp) <= 0) {
                System.out.println("Money has been withdrawn form your account. Balance: " + temp);
                System.out.println("Warning: Low funds");
            }
            else {
                System.out.println("Money has been withdrawn form your account. Balance: " + temp);
            }
            this.amount = temp;
        }
    }

}
