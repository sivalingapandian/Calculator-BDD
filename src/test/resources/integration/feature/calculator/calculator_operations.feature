Feature: Calculator operations

  Scenario: Adding values
    Given calculator is just switched on
    When user clicks '+' key and enters '2.1'
    Then presses = key should display value '2.1'