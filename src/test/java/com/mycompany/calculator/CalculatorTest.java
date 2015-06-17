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

    /*@Test
    public void shouldReturnAddedAndSubtractedValue() {
        MathTool mathTool = getInstance();
        Double testAddValue = 2.1;
        Assert.assertEquals(2.1, mathTool.performOperation('+', testAddValue), 0);
        Double testSubtractValue = 2.3;
        Assert.assertEquals(-0.2,mathTool.performOperation('-',testSubtractValue),0.0);
    }*/

    /*@Test
    public void shouldReturnMultipliedAndDividedValue() {
        MathTool mathTool = getInstance();
        Double testAddValue = 1.0;
        Assert.assertEquals(testAddValue, mathTool.performOperation('+', testAddValue), 0);
        Double testMultiplicationValue = 10.0;
        Assert.assertEquals(10.0, mathTool.performOperation('*', testMultiplicationValue), 0);
        Double testDivisionValue = 2.0;
        Assert.assertEquals(6.0,mathTool.performOperation('/',testDivisionValue),0.0);
    }*/

}