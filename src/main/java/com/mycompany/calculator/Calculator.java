package com.mycompany.calculator;

/**
 * Calculator implementation
 *
 * Created by pandian on 6/17/15.
 */
public class Calculator implements MathTool {
    public Double performOperation(char operation, Double value) {
        return null;
    }

    public Double reset() {
        return null;
    }

    /*Double calculatorMathSummary = 0.0;

    @Override
    public Double performOperation(char operation, Double value) {
        switch (operation) {
            case '+': calculatorMathSummary = calculatorMathSummary + value;
                break;
            case '-': calculatorMathSummary = calculatorMathSummary - value;
                break;
            case '*': calculatorMathSummary = calculatorMathSummary * value;
                break;
            case '/': calculatorMathSummary = calculatorMathSummary / value;
                break;
            default:
                break;
        }
        return calculatorMathSummary;
    }

    @Override
    public Double reset() {
        calculatorMathSummary = 0.0;
        return calculatorMathSummary;
    }*/
}
