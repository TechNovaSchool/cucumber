@SmartBearTest
Feature: Smart Bear Login Test

  Background:
    When User is on SmartBear login page
    And User enters correct username2
    And User enters correct password
    And User clicks to login button

  @positiveLoginSB
  Scenario: As a user I should be able to login using authenticated test data
    Then User should be logged in and be able to verify Welcome text is displayed

  @negativeLoginSB
  Scenario: When user enters correct username and incorrect password user should see error message
    Then User should see the error message displayed on the page