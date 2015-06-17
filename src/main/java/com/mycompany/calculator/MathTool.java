package com.mycompany.calculator;

/**
 * Interface to define math tool operations
 *
 * Created by pandian on 6/17/15.
 */
public interface MathTool {

    /**
     * Method to perform mathematical operation, it returns current result with the previous value
     *
     * @param operation it indicates type of operation '+' / '-' / '*' / '/'
     * @param value value to be used to perform action
     * @return math result
     */
    Double performOperation(char operation, Double value);


    /**
     * Resets current value back to zero
     *
     * @return reset value
     */
    Double reset();

}
