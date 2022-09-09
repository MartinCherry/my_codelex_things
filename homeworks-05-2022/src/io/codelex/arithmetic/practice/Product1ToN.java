package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int sum = a;

        for (int i = a; i<=b; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
