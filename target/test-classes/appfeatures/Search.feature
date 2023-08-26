Feature: Amazon Search
@Smoke	
Scenario: Search a Product MacBook Pro
Given I have a search field on Amazon Page
When I Search for a product with name "Apple MacBook Pro" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed
Then Order id is 12345 and username is "Dada"
@Regression
Scenario: Search a Product iPhone
Given I have a search field on Amazon Page
When I Search for a product with name "iPhone" and price 1200
Then Product with name "iPhone" should be displayed
Then Order id is 877578 and username is "DK Automation"