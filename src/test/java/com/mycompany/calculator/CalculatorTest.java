package com.mycompany.calculator;


import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Calculator
 *
 * Created by pandian on 6/17/15.
 */
public class CalculatorTest {

    private MathTool getInstance() {
        return new Calculator();
    }

    @Test
    public void shouldReturnAddedResult() {
        Double testValue = 2.3;
        Assert.assertEquals(testValue,getInstance().performOperation('+',testValue),0);
    }

    @Test
    public void shouldResetValueToZero() {
        Assert.assertEquals(0.0,getInstance().reset(),0);
    }

}