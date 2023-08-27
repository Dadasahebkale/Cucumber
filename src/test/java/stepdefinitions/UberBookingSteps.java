package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	@Given("User wants to select a car type {string} from uber application")
	public void user_wants_to_select_a_car_type_from_uber_application(String cartype) {
	    System.out.println("Step :1 User want to select car type :"+cartype);
	}
	@When("User selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String cartype, String startlocation, String droplocation) {
	  System.out.println("Step :2 User selected car Type : "+cartype+ " from "+startlocation+" to "+droplocation);  
	}
	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	    System.out.println("Step :3 Journey has been started ");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step :4 Driver ends his journey ");
	    
	}

	@Then("User pays {int} Indian ruppes")
	public void user_pays_indian_ruppes(Integer price) {
	    	System.out.println("Step :5 User pays "+price);
	}
	@Then("User checks trip details")
	public void user_checks_trip_details() {
		  System.out.println("Step 6: User checks trip details");
		}




}
