package io.codelex.secondtest.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card{


    public DebitCard(String cardNumber, String cardName, String ccv) {
        super(cardNumber, cardName, ccv);
    }

    @Override
    public void addMoney(double amount) {
        BigDecimal temp = this.amount.add(BigDecimal.valueOf(amount));
        if (BigDecimal.valueOf(10000).compareTo(temp) < 0) {
            System.out.println("Warning: Too much money");
        }
        System.out.println("Money has been added to your account. Balance: " + temp);
        this.amount = temp;

    }

    @Override
    public void withdrawMoney(double amount) {
        BigDecimal temp = this.amount.subtract(BigDecimal.valueOf(amount));
        if (BigDecimal.valueOf(0).compareTo(temp) > 0) {
            throw new NotEnoughFundsException();
        }
        else {
            System.out.println("Money has been widthrawn from your account. Balance: " + temp);
            this.amount = temp;
        }
    }

}
