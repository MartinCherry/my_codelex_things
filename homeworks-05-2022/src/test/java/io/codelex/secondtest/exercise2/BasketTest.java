package io.codelex.secondtest.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {


    @Test
    void appleTestFullBasket() {
        Basket<Apple> appleBasket = new Basket<>();
        Apple apple = new Apple();
        for (int i = 0; i < 10; i++) {
            appleBasket.add(apple);
        }
        Exception exception = Assertions.assertThrows(BasketFullException.class, () -> {
            appleBasket.add(apple);
        });
        String expectedMessage = exception.getMessage();
        String actualMessage = "Basket is full!";
//        appleBasket.add(apple);

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void mushroomTestEmptyBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        Mushroom mushroom = new Mushroom();
        mushroomBasket.add(mushroom);
        mushroomBasket.remove(mushroom);
        Exception exception = Assertions.assertThrows(BasketEmptyException.class, () -> {
            mushroomBasket.remove(mushroom);
        });
        String expectedMessage = exception.getMessage();
        String actualMessage = "Basket is empty!";
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}
