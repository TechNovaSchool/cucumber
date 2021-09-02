@regression
Feature: Google feature test verifications
  DW-209 Test Plan 21

 @test123
  Scenario: Google title verification
    Given I am on google home page
    Then I should see that title contains Google


  @TEST_DW-132
  Scenario: Google Test
    Given I am on google home page
    When I search for pen
    Then I see the title contains pen