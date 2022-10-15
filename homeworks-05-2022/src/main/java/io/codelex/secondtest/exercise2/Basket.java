package io.codelex.secondtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    List<T> basketList = new ArrayList<>();
    int itemsInBasket = 0;

    public void add(T element) {
        if (itemsInBasket >= 10) {
            throw new BasketFullException();
        }
        else {
            basketList.add(element);
            itemsInBasket++;
            System.out.println("Item added. " + this.itemsInBasket + " items in basket!");
        }
    }

    public void remove(T element) {
        if (itemsInBasket <= 0) {
            throw new BasketEmptyException();
        }
        else {
            if (basketList.contains(element)) {
                basketList.remove(element);
                itemsInBasket--;
                System.out.println("Item removed. " + this.itemsInBasket + " items in basket!");
            }
            else {
                System.out.println("No item found");
            }
        }
    }
}
