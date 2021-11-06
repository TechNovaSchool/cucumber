Feature: Login to the Webpage

  @airTable
  Scenario: AirTale login home base page
    Given Navigate to login page
    When  Enter the email address
    And   Enter the password
    And   press the sign in button
    Then  Home base page should appear
    And   Click on Dragon warior button
    When I add a new record
    Then I will check with API that record was saved
    #And I check status code is 200


