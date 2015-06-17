Feature: Calculator Addition and subtraction operations

  Scenario: Adding and Subtracting values
    Given calculator is just switched on
    When user clicks '-' key and enters '2.1'
    Then presses = key should display value '-2.1'
    When user clicks '+' key and enters '3.1'
    Then presses = key should display value '1.0'

  Scenario: Multiplication and  division
    Given calculator is just switched on
    When user clicks '+' key and enters '1.0'
    Then presses = key should display value '1.0'
    When  user clicks '*' key and enters '10.0'
    Then presses = key should display value '10.0'
    When user clicks '/' key and enters '2.0'
    Then presses = key should display value '5.0'
