@wiki
Feature: Verify search in Wikipedia

#  Background:
#    Given user click on wikipedia page
#    When User type Steve Jobs in the wiki search box
#    And User click search button


  Scenario: Wikipedia search functionality
    Then User see Steve Jobs in the wiki page title

  Scenario: Wikipedia Search Functionality Header Verification
    Then User see Steve Jobs in the main header

  Scenario: Wikipedia search functionality Image Header verification
  Then User see Steve Jobs in the Header verification


  @scenarioOutline
    Scenario Outline:
      Given user click on wikipedia page
      When User type "<name>" in the wiki search box
      And User click search button
      Then User see "<name>" in the Header verification

 Examples:
      |name        |
      |Barack Obama|
     |Donald Trump|