Feature: Scenario Outline

  Scenario Outline: Login functionality for a Salesforce
    Given Url Login Page
    When I enter Username as "<username>" and Password as "<password>"
    Then Login should be unsuccessful
    Examples:
      | username                  | password       |
      | oscar.lopez.a@outlook.com | Test.Fer.At11  |
      | oscar.lopez@outlook.com   | Test.Fer.At111 |