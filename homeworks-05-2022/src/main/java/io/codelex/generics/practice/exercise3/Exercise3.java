package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        MyClass<String> myClassObject1 = new MyClass<>("My Class Object 1");
        MyClass<String> myClassObject2 = new MyClass<>("My Class Object 2");

        MyChildClass<String> myChildClassObject1 = new MyChildClass<>("My Child Class Object 1");
        MyChildClass<String> myChildClassObject2 = new MyChildClass<>("My Child Class Object 2");

        MyClass<String> myClassObject3 = new MyClass("My Class Object 3");
        MyChildClass<String> myChildClassObject3 = new MyChildClass<>("My Child Class Object 3");


        List<MyClass<String>> myClassList = new ArrayList<>();
        myClassList.add(myClassObject1);
        myClassList.add(myClassObject2);

        List<MyClass<String>> myClassList2 = new ArrayList<>();
        myClassList2.add(myClassObject1);
        myClassList2.add(myClassObject2);

        List<MyChildClass<String>> myChildClassList = new ArrayList<>();
        myChildClassList.add(myChildClassObject1);
        myChildClassList.add(myChildClassObject2);

        List<MyChildClass<String>> myChildClassList2 = new ArrayList<>();
        myChildClassList2.add(myChildClassObject1);
        myChildClassList2.add(myChildClassObject2);

        addAllY(myClassList2, myClassList);
        addAllY(myChildClassList2, myChildClassList);


        addAllX(myChildClassList, myClassList);
        System.out.println(myClassList);


    }

    public static <T> void add(T value, List<? super T> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        l.addAll(v);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        l.addAll(v);
    }
}
