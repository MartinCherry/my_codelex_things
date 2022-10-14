package io.codelex.secondtest.exercise1;

public class NotEnoughFundsException extends RuntimeException{

    public NotEnoughFundsException() {
        super("Not enough money in account.");
    }
}
