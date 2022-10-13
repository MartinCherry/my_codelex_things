package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        MyClass myClassObject1 = new MyClass("My Class Object 1");
        MyClass myClassObject2 = new MyClass("My Class Object 2");

        MyChildClass myChildClassObject1 = new MyChildClass("My Child Class Object 1");
        MyChildClass myChildClassObject2 = new MyChildClass("My Child Class Object 2");

        List<MyClass> myClassList = new ArrayList<>();
        myClassList.add(myClassObject1);
        myClassList.add(myClassObject2);

        List<MyChildClass> myChildClassList = new ArrayList<>();
        myChildClassList.add(myChildClassObject1);
        myChildClassList.add(myChildClassObject2);


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
