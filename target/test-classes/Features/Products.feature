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


