package io.codelex.classesandobjects.practice.exercise10;

public class Exercise10 {
    public static void main(String[] args) {
        BankAccount benBen = new BankAccount("Benson", 100.56);
        BankAccount badBenBen = new BankAccount("Bad Benson", -200.89);
        BankAccount goodBenBen = new BankAccount("Bad Benson", 500);

        System.out.println(benBen);
        System.out.println(badBenBen);
        System.out.println(goodBenBen);
    }
}
