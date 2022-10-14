package io.codelex.secondtest.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {


    @Test
    void appleTest(){
        Basket<Apple> appleBasket = new Basket<>();
        Apple apple = new Apple();
        for(int i = 0; i<10; i++) {
            appleBasket.add(apple);
        }
        Exception exception = Assertions.assertThrows(BasketFullException.class, () -> {
            appleBasket.add(apple);});
        String expectedMessage = exception.getMessage();
        String actualMessage = "Basket is full!";
        appleBasket.add(apple);

        Assertions.assertTrue(actualMessage.contains(expectedMessage));


    }
}
