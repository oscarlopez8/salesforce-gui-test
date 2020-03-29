Feature: Opportunity

  Background:
    Given I am logged in SalesForce with "username" and "password"
    And I be on the Homepage

  @create-opportunity @delete-account @delete-opportunity
  Scenario: Creates a contact inside an opportunity
    When I open the Opportunity page
    And I create a new Account with the following information
      | Name | John Doe Test |
    And I am on the Opportunity form from Opportunity page
    Then The account name should be displayed in the Account Name input Text

  @create-opportunity @delete-opportunity
  Scenario: Creates a Event and assign to an Opportunity
    When I open the New Event form
    And I add a new Event with the following information
      | Assigned To | Name Last Name     |
      | Subject     | Call               |
      | Start Date  | One hour from now  |
      | End Date    | Two hours from now |
    And I open the Opportunity page
    And I am on the Opportunity form from Opportunity page

