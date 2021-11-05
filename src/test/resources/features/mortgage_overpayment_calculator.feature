Feature: Mortgage overpayment calculator


  @reg
  Scenario: Calculate the mortgage over payments
    Given I am on the mortgage over payments calculator screen
    And select the repayment mortgage option
    And enter the mortgage balance option equals to "520,000"
    And enter the interest rate equals to "1.87"
    And enter remaining term years equals to "7"
    And enter remaining term months equals to "10"
    And select the one-off lump sum overpayment
    And select the One-off lump sum overpayment amount equals to "500,000"
    When I select the "get results" button
    Then I should see the "Your results" information section



