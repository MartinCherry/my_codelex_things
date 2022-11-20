package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2App {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("word");
        stringList.add("Second text");
        System.out.println(Exercise2.concatenate(stringList));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        System.out.println(Exercise2.concatenate(integerList));

        List<Object> objectList = new ArrayList<>();
        objectList.add(new Object());
        System.out.println(Exercise2.concatenate(objectList));
    }
}
