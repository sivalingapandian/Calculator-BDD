Feature: Calculator subtraction operations

  Scenario: Subtracting values
    Given calculator is just switched on
    When user clicks '-' key and enters '2.1'
    Then presses = key should display value '-2.1'
    When user clicks '-' key and enters '3.1'
    Then presses = key should display value '-5.2'


