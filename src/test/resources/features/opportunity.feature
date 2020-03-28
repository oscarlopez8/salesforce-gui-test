Feature: Opportunity

  Background:
    Given I am logged in SalesForce with "username" and "password"
    And I be on the Homepage

  @create-opportunity @delete-account @delete-opportunity
  Scenario: Create a contact inside an opportunity
    When I open the Opportunity page
      And I create a new Account with the following information
        | Name | John Doe Test |
      And I am on the Opportunity form from Opportunity page
    Then The account name should be displayed in the Account Name input Text
