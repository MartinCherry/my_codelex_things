package io.codelex.classesandobjects.practice.exercise13;

public class Exercise13 {
    public static void main(String[] args) {

        Account person1 = new Account("Person1", 100);
        Account person2 = new Account("Person2", 1000);
        person1.deposit(20);
        System.out.println(person1.balance());

    }

    private static void transfer(Account from, Account to, int amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }
}
