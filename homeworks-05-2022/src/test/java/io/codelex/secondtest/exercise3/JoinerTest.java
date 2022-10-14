package io.codelex.secondtest.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JoinerTest {

    @Test
    void joinerTest(){
        Joiner<Integer> something = new Joiner<>("-");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        String result = something.join(integerList, 2);
        Assertions.assertEquals("1-1", result);
    }
}
