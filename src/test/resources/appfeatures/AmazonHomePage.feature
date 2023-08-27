Feature: Amazon Home Page
In order to test Amazone Home Page of Application
As a Registered user
I want to specify the features of home page

Scenario: Home Page Top Panel Section
Given User is on Amazon home page
Then User gets a Amazon search field
And Username is also displayed next to search field
And Amazon logo is also displayed
And Cart link is also displayed

Scenario: Amazon Todays Deals Section
Given User is on Amazon home page
When User scrolls down to Todays Deals section
Then User gets the list of multiple products
And User gets product image and price details
And User can see more products by clicking on carousel

Scenario: Amazon Footer Links section
Given User is on Amazon home page
When User scrolls down to footer of the page
Then User gets all Country links
|Australia|
|Brazil|
|Canada|
|China|
And User gets all amazon services links
|Amazon Business|
|Amazon Web Services|
And User gets all privacy policy links
|Privacy Notice|
|User & Sale|



