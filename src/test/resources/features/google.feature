Feature: Google feature test verifications
  DW-209 Test Plan 21
  #to add comments

  Scenario: Google title verification
    Given I am on google home page
    Then I should see that title contains Google

    Scenario: Verify search box
      Given I am on google home page
      When I search for pen
      Then I see the title contains pen
