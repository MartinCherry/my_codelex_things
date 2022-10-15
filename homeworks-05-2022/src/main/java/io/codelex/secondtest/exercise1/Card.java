package io.codelex.secondtest.exercise1;

import java.math.BigDecimal;

public abstract class Card {

    String cardNumber;
    String cardName;
    String ccv;

    BigDecimal amount;

    public Card(String cardNumber, String cardName, String ccv) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.ccv = ccv;
        this.amount = BigDecimal.ZERO;
    }

    public abstract void addMoney(double amount);

    public abstract void withdrawMoney(double amount);

    public BigDecimal accountBalance() {
        return this.amount;
    }


}
