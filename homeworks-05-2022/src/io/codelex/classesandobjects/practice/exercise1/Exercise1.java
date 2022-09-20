package io.codelex.classesandobjects.practice.exercise1;

public class Exercise1 {

    public static void main(String[] args) {


        Product product1 = new Product("Banana", 1.1, 13);
        Product product2 = new Product("Logitech mouse", 70, 14);
        Product product3 = new Product("iPhone 5s", 999.99, 3);
        Product product4 = new Product("Epson EB-U05", 440.46, 1);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        product2.setAmountAtStart(10);

        System.out.println(product2);

        product2.setPriceAtStart(59.99);

        System.out.println(product2);

    }
}
