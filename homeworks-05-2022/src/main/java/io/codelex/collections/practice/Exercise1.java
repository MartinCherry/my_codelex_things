package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */

public class Exercise1 {
    public static void main(String[] args) {
        String[] carArray = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> carArrayList = new ArrayList<>();
        carArrayList.addAll(Arrays.stream(carArray).toList());
        System.out.println(carArrayList);

        //todo - replace array with a HashSet and print out the results
        Set<String> carSet = new HashSet<>();
        carSet.addAll(Arrays.stream(carArray).toList());
        System.out.println(carSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> carHashMap = new HashMap<>();
        for (String car : carArray) {
            String origin = "";
            switch (car) {
                case "Audi":
                case "Mercedes":
                case "BMW":
                case "VolksWagen":
                    origin = "Germany";
                    break;
                case "Honda":
                    origin = "Japan";
                    break;
                case "Tesla":
                    origin = "USA";
                    break;
            }
            carHashMap.put(car, origin);
        }
        System.out.println(carHashMap);
    }
}
