Feature: Amazon Test

  @SignIn
  Scenario: To test if amazon sigin is working correctly
    Given The driver is initiated and amazon site is loaded
    When User Enters credentials number "916374231718" and password "project@123"
    Then Validate if sigin is sucessfull.

  @Checkout
  Scenario: To test if checkout page is functioning correctly
    Given The driver is initiated and amazon site is loaded
    And User Enters credentials number "916374231718" and password "project@123"
    When User searches "OnePlus Nord" and clicks on buynow
    Then Check if app is navigating to checkout page

  @SaveForLater
  Scenario: To test if Save for later functionality is working correctly
    Given The driver is initiated and amazon site is loaded
    And User Enters credentials number "916374231718" and password "project@123"
    When User searches "OnePlus Nord" and clicks on buynow
    And Navigates to cart and clicks on save for later
    Then check if item is added in save for later

  @AddAddress
  Scenario: To test if add address functionality is working correctly
    Given The driver is initiated and amazon site is loaded
    And User Enters credentials number "916374231718" and password "project@123"
    When User clicks on your addresses in account settings
    And then to adds new address
    Then Check if address is sucessfully saved
