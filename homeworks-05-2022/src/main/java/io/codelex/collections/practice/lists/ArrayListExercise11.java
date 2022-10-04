package io.codelex.collections.practice.lists;

import java.util.*;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        String[] array = "One Two Three Four Five Six Seven Eigth Nine Ten".split(" ");

        //TODO: Create an ArrayList with String elements
        List<String> arrayList = new ArrayList<>();

        //TODO: Add 10 values to list
        arrayList.addAll(Arrays.stream(array).toList());
        System.out.println(arrayList);
        System.out.println("\n");

        //TODO: Add new value at 5th position
        arrayList.add(4, "New Five");
        System.out.println(arrayList);
        System.out.println("\n");

        //TODO: Change value at last position (Calculate last position programmatically)
        arrayList.set(arrayList.size() - 1, "New Last");
        System.out.println(arrayList);
        System.out.println("\n");

        //TODO: Sort your list in alphabetical order
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("\n");

        //TODO: Check if your list contains "Foobar" element
        System.out.println(arrayList.contains("Foobar"));
        System.out.println("\n");

        //TODO: Print each element of list using loop
        for (String element : arrayList) {
            System.out.println(element);
        }
    }

}
