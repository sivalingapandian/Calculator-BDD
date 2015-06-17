package integration.feature.calculator;

import com.mycompany.calculator.Calculator;
import com.mycompany.calculator.MathTool;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * Test class for running steps
 *
 * Created by pandian on 6/17/15.
 */
public class CalculatorOperationSteps {

    MathTool calculator;
    Double result;

    @Given("^calculator is just switched on$")
    public void calculator_is_just_switched_on() throws Throwable {
        calculator = new Calculator();
    }

    @When("^user clicks '(.*)' key and enters '(.*)'$")
    public void user_clicks_key_and_enters(char operation, Double  value) throws Throwable {
        result = calculator.performOperation(operation,value);
    }

    @Then("^presses = key should display value '(.*)'$")
    public void presses_key_should_display_value(Double value) throws Throwable {
        Assert.assertEquals(result, value, 0.1);
    }
}
