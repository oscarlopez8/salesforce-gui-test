Feature: Case

  Background:
    Given I am logged in SalesForce with "username" and "password"
    And I be on the Homepage

  Scenario: Follow a Case
    When I open the Case page
      And I open the Case form from Cases page
      And I create a new Case with the following information
        | Status   | Working |
        | Priority | Medium  |
        | Origin   | Phone   |
      And I do click on Details Menu
    When I close the Case
    Then The case should be closed.


