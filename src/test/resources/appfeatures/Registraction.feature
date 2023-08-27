Feature: User Registration

Scenario: user regisration with different data
	Given User is on registration page
	When User enters following user details
	| dada | automation | dada@abc.com | 99999 | Pune |
	| tom  | peter      | tomp@abc.com | 87987 | London |
	| lisa | kent	      | lisa@abc.com | 96877 | New York |
	| monu | kale	      | monu@abc.com | 78688 | Mumbai |
	Then user registration should be successfull
	
Scenario: user regisration with different data with colums
	Given User is on registration page
	When User enters following user details with colums
	|FirstName|LastName| Email        | Phone | City |
	| dada | automation | dada@abc.com | 99999 | Pune |
	| tom  | peter      | tomp@abc.com | 87987 | London |
	| lisa | kent	      | lisa@abc.com | 96877 | New York |
	| monu | kale	      | monu@abc.com | 78688 | Mumbai |
	Then user registration should be successfull