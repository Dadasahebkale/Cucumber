Feature: Amazon Add feature
@All  
Scenario: Add a product to the add cart
Given I want add "Apple 14 pro" in the add cart
When I want add "Battery size" with size 3279 mAh
Then Product name with "Apple 14 pro" battery size it needs to add into cart
@Smoke  
Scenario: Add a product to the add cart
Given I want add "Samsung 13 pro" in the add cart
When I want add "Battery size" with size 5000 mAh
Then Product name with "Samsung 13 pro" battery size it needs to add into cart
@Regression
Scenario: Add a product to the add cart
Given I want add "Note pro" in the add cart
When I want add "Battery size" with size 4000 mAh
Then Product name with "Apple 14 pro" battery size it needs to add into cart
@Prod
Scenario: Add a product to the add cart
Given I want add "Black Berry" in the add cart
When I want add "Battery size" with size 4009 mAh
Then Product name with "Black Berry" battery size it needs to add into cart

 