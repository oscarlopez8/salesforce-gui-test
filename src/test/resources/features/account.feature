Feature: Manage account

  Background:
    Given I am logged in SalesForce with "username" and "password"
    And I be on the Homepage

#  @create-account @delete-account
#  Scenario: Customize account page layout
#    When I go to My Settings page
#    And I select the Account page to Customize it
#    And I move the last item to the top in the Selected List
#    And I go to the Account page
#    Then Check the account page to make sure the item appears first

  Scenario Outline: Create a new account with requirement fields from accounts page
    When I open the Accounts page
    And I open the Account form from Accounts page
    And I create an Account with the <Name>

#    Then the account name should be displayed in the Account page
    When I go to the Account Details from Account page
    Then the account name should be displayed in the Account Details
    When I open the Accounts page
    Then the account should be displayed on Accounts page
    Examples:
      | Name            |
      | New Account     |
      | New Account two |
