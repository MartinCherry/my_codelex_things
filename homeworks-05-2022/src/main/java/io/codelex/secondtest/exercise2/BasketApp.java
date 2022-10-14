package io.codelex.secondtest.exercise2;

public class BasketApp {

    public static void main(String[] args) {

        Basket<Apple> appleBasket = new Basket<>();
        Apple apple = new Apple();
        appleBasket.add(apple);
        appleBasket.add(apple);
        appleBasket.add(apple);
        appleBasket.add(apple);
        appleBasket.add(apple);
        appleBasket.add(apple);
        appleBasket.add(apple);
        appleBasket.add(apple);
        appleBasket.add(apple);
        appleBasket.add(apple);
        appleBasket.add(apple);

        Basket<Mushroom> mushroomBasket = new Basket<>();
        Mushroom mushroom = new Mushroom();
        mushroomBasket.add(mushroom);
        mushroomBasket.remove(mushroom);
        mushroomBasket.remove(mushroom);

    }
}
