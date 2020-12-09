Feature: Search on Google

  Scenario Outline: Search on google for fruits
    Given i am on google search page
    When i search for "<word>"
    Then the tittle have to contain "<word>"

    Examples:
    |word|
    |apple|
    |orange|
    |pineapple|


  Scenario: Search on google for orange
    Given i am on google search page
    When i search for "<banana>"
    Then the tittle have to contain "<orange>"