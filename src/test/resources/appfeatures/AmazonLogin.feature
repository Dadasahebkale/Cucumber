Feature: Login Page
In order to test login page
As a Registered user
I want to specify the login conditions

Scenario: Amazon Login Page
Given User is on the amazon login page
And Sign in button is present on screen
When User clicks on Sign in button
Then User displays Login screen
When User enters "dk@abc.com" in the username field
And User enters "abc@1234" in the password field
And User clicks Sign in button
Then User is on the home page
And Title of home is "Amazon"
But Sign in button not present

