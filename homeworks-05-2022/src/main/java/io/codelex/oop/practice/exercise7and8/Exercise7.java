package io.codelex.oop.practice.exercise7and8;

public class Exercise7 {

    public static void main(String[] args) {
        Computer computer = new Computer("i7", "16GB", "nVidia", "ASUS", "XR2665");

        System.out.println(computer);

        Laptop laptop = new Laptop("i5", "8GB", "intel", "Acer", "XX15", "1200Ah");

        System.out.println(laptop.getCompany());

    }
}
