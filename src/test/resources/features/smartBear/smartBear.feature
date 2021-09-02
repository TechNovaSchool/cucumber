Feature: User should be able to place order with different data sets

  @smartBearOrder
  Scenario Outline: User should be able to place order with different data sets
    Given User is logged into SmartBear Tester account and on Order page
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity input box
    And User enters "<customerName>" to costumer name input box
    And User enters "<street>" to street input box
    And User enters "<city>" to city input box
    And User enters "<state>" to state input box
    And User enters "<zip>" to zip input box
    And User selects "<cardType>" as card type from radio buttons
    And User enters "<cardNumber>" to card number input box
    And User enters "<expirationDate>" to expiration date into input box
    And User clicks process button
    Then User verifies "<expectedName>" is in the table

    Examples:
      | product     | quantity | customerName | street    | city       | state | zip   | cardType         | cardNumber       | expirationDate | expectedName |
      | MyMoney     | 1        | Andrew       | 674 Road  | Niles      | IL    | 44444 | MasterCard       | 1234123412341234 | 09/21          | Andrew       |
     | FamilyAlbum | 2        | Kamol        | 674 Drive | New York   | NY    | 44444 | Visa             | 1234123412341234 | 09/21          | Kamol        |
     | ScreenSaver | 4        | James        | 456 Road  | New Jersey | NJ    | 44444 | American Express | 1234123412341234 | 09/21          | James        |
