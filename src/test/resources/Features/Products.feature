Feature: This file contains tests of different products

  Scenario: Verify the title of HomePage
    #Given Chrome browser is opened
    And url of myntra is launched
    Then Verify the title of homepage

  Scenario: Verify Search result for Polo men
    #Given Chrome browser is opened
    And url of myntra is launched
    When User Searches for Polo men
    Then All results should be related to polo

  Scenario: Verify That Login Page Is Display
    #Given Chrome browser is opened
    And url of myntra is launched
    When User hover on Profile
    Then click on LOGIN_SIGNUP button Verify That Login Page Is Display

  Scenario: Add Product to Cart
    Given Chrome browser is opened
    And url of myntra is launched
    When User Searches for Black jeans
    And click on the first search result
    And select the size
    Then click on the Add to Cart button and the product should be added in cart
    
Scenario: Verify Search result Clicking on Bag
#Given Chrome browser is opened
And url of myntra is launched
When User Clicks on Bag
And User Clicks on Add Items From Wish List
Then Login page should Be Open

Scenario: Verify Search result Clicking on ContactUs
#Given Chrome browser is opened
And url of myntra is launched
When User Clicks on ContactUs
And User Clicks on RecentIssues
Then Help Center Login page should Be Open

Scenario: Verify Search result for WomenAccessories
#Given Chrome browser is opened
And url of myntra is launched
When User Hover on Women Menu
And User Clicks on Belts,Scarves&More
And User Clicks on Checkbox of Jewellary Set
And User Clicks on Rating
Then User Clicks on Checkbox of Four Star

Scenario: Verify Search result Clicking on ContactUs
#Given Chrome browser is opened
And url of myntra is launched
When User Clicks on Beauty
And User Clicks on Haircream
Then Click on FilterMen
