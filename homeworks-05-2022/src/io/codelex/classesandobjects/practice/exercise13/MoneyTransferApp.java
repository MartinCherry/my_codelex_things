package io.codelex.classesandobjects.practice.exercise13;

public class MoneyTransferApp {
    public static void main(String[] args) {

        Account account1 = new Account("Matt's account", 100);
        Account account2 = new Account("My account", 0);

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        System.out.println(account1);
        System.out.println(account2);

        account1.withdrawal(100);
        account2.deposit(100);

        System.out.println(account1);
        System.out.println(account2);

        transfer(a, b, 50);
        transfer(a, c, 25);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    private static void transfer(Account from, Account to, int amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }
}
