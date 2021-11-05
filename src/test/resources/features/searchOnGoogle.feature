Feature: Search on Google

  @test1
  Scenario Outline: Search on google for fruits
    Given i am on google search page
    When i search for "<word>"
    Then the tittle have to contain "<word>"

    Examples:
    |word|
    |software testing|
    |test automation|
    |devops|


  @test2
  Scenario: Search on google for orange
    Given i am on google search page
    When i search for "aws"
    Then the tittle have to contain "aws"