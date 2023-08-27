
@All
Feature: Uber Booking features
Background:


 @Smoke
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "Sedan" from uber application
    When User selects car "Sedan" and pick up point "Banglore" and drop location "Pune"
  	Then Driver starts the journey
		And Driver ends the journey
		Then User pays 1000 Indian ruppes
		Then User checks trip details

  @Smoke @Regression
  Scenario: Booking Cab SUV
    Given User wants to select a car type "SUV" from uber application
    When User selects car "SUV" and pick up point "Mumbai" and drop location "Chennai"
   	Then Driver starts the journey
		And Driver ends the journey
		Then User pays 1200 Indian ruppes
  
  @Prod
  Scenario: Booking Cab Mini
    Given User wants to select a car type "Mini" from uber application
    When User selects car "Mini" and pick up point "Nagpur" and drop location "Nashik"
  	Then Driver starts the journey
		And Driver ends the journey
		Then User pays 1300 Indian ruppes
  
  @Smoke @Regression
  Scenario: Booking Cab Mercedise
    Given User wants to select a car type "Mercedise" from uber application
    When User selects car "Mercedise" and pick up point "Shrigonda" and drop location "Kolhapur"
 		Then Driver starts the journey
		And Driver ends the journey
		Then User pays 1900 Indian ruppes