Feature: Case

  Background:
    Given I am logged in SalesForce with "username" and "password"
    And I be on the Homepage

  Scenario: Follow a Case
    When I open the Case page
    And I open the Case form from Cases page
    And I create a new Case with the following information
      | Status       | New          |
      | Priority     | Medium       |
      | Origin       | Phone        |
      | Contact Name | Contact Name |
      | Account Name | Account Name |
      | Reason       | Installation |
    Then The Case name should be displayed in the Case page
    When I create Question for the Case
    And I Change the status to Working
    And I Create an Question to solve a Case
    Then The Question should be create.
    When The Client give the answer
    And I give the solution.
    Then I close the Case
