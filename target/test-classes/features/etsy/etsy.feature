@etsySearch
Feature: Verify search box

  @etsy
  Scenario: Verify search box
    Given I am on etsy homepage
    When I search for "iphone"
    And I click on search box
    Then I see the title contains "iphone"
@outlineEx
   Scenario Outline: Verify search box for multiple inputs
     Given I am on etsy homepage
     When I search for "<searchValue>"
     And I click on search box
     Then I see the title contains "<searchValueResult>"

     Examples:
     |searchValue|searchValueResult|
     |cover      |laptop            |
#     |iphone     |laptop           |
#     |book       |book             |



