package org.bluebird.quiz.model;

import org.junit.Assert;
import org.junit.Test;

public class ModelTest {

    @Test
    public void factorialTest(){
        //given
        int number = 5;

        //when
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(number);

        //then
        Assert.assertEquals(120,result);
        System.out.println(result);
    }
}
