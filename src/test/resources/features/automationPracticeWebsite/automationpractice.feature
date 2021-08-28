@automationPractice
Feature: Open page test


  Scenario: Verify the title
    Given I open the AutomationPractice Website
    When I check the title
    Then I should see the correct name
    When I add a new product to my cart
    Then I check it contains a product text
