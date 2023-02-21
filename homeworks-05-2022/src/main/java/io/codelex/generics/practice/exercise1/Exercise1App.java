package io.codelex.generics.practice.exercise1;

public class Exercise1App {

    public static void main(String[] args) {

        Exercise1<String> someObject = new Exercise1<>();

        someObject.add(0, "Test");
        someObject.add(0, "Test2");
        someObject.add(1, "Test3");


        System.out.println(someObject);

    }

}
