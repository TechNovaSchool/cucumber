@wiki
Feature: Verify search in Wikipedia

@wiki1
  Scenario: Wikipedia search functionality
    Given user click on wikipedia page
    When User type Steve Jobs in the wiki search box
    And User click search button
    Then User see Steve Jobs in the wiki page title
@wiki2
  Scenario: Wikipedia Search Functionality Header Verification
    Given user click on wikipedia page
    When User type Steve Jobs in the wiki search box
    And User click search button
    Then User see Steve Jobs in the main header
@wiki3
  Scenario: Wikipedia search functionality Image Header verification
    Given user click on wikipedia page
    When User type Steve Jobs in the wiki search box
    And User click search button
  Then User see Steve Jobs in the Header verification


  @scenarioOutlinewiki
    Scenario Outline:
      Given user click on wikipedia page
      When User type "<name>" in the wiki search box
      And User click search button
      Then User see "<name>" in the Header verification

 Examples:
      |name        |
      |Barack Obama|
     |Donald Trump|