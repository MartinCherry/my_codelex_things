package io.codelex.secondtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    List<T> basketList = new ArrayList<>();

    public void add(T element) {
        if (basketList.size() >= 10) {
            throw new BasketFullException();
        }
        else {
            basketList.add(element);
            System.out.println("Item added. " + this.basketList.size() + " items in basket!");
        }
    }

    public void remove(T element) {
        if (basketList.isEmpty()) {
            throw new BasketEmptyException();
        }
        else {
            if (basketList.contains(element)) {
                basketList.remove(element);
                System.out.println("Item removed. " + this.basketList.size() + " items in basket!");
            }
            else {
                System.out.println("No item found");
            }
        }
    }
}
