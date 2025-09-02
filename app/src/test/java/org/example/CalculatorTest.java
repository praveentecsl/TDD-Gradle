package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class CalculatorTest {

    @Test
    public void addTest(){

        Calculator calc = new Calculator();
        int result = calc.add(3, 9);
        assertEquals(12, result);


    }



}
