@api
Feature: Airtable API Test

  Scenario: Check status code
    When I hit the GET API
    And I check status code is "200"

    Scenario: Check first record value
      When I hit the GET API
      And I check status code is 200
      And I verify the first name is "Carmen"

@apiPost
      Scenario: Check POST endpoint
       When I create a record
       And I check status code is 200
       Then I am able to get recordID
       And I update the record email to first and last name
       And I check status code is 200
       And I delete the record
       And I check status code is 200















