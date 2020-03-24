Feature: Manage account
  Background:
    Given I am logged in Salesforce with "username" and "password"
    And I navigate to the Home page

  @create-account @delete-account
  Scenario: Customize account page layout
    When I go to My Settings page
    And I select the Account page to Customize it
    And I move the last item to the top in the Selected List
    And I go to the Account page
    Then Check the account page to make sure the item appears first
