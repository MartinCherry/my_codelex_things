package io.codelex.exceptions.practice;

public class Exercise2 {

    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Method A throwed an error with message: " + e.getMessage());
        }
    }

    private static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("MethodB throwed an error with message: " + e.getMessage());
        }
    }

    private static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println(" Method C throwed and error with message: " + e.getMessage());
        }
    }

    private static void methodC() throws ArithmeticException {
        System.out.println(2 / 0);
    }
}
