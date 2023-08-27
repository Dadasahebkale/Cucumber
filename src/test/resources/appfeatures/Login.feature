Feature: Login Features

Scenario Outline: Login fail -possible combinations
Given User is on Application landing page
When User clicks on Sign in button
Then User is displayed login screen
When User enters "<UserName>" in the username field
And User enters "<Password>" in the password field
And User clicks on Sign in button
Then User gets Login failed error message
	
	Examples:
	| UserName        | Password |
	|incorrectusername| 123456   |
	|dkautomation     |incorrectpassword|
	|incorrectusername|incorrectpassword|
	

