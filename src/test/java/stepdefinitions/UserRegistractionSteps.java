package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistractionSteps {
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	    System.out.println("User navigates registraction page");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	   
	  List<List<String>> userList= dataTable.asLists(String.class); 
	  
	  for(List<String> e :userList) {
		  System.out.println(e);
	  }
	}
	
	@When("User enters following user details with colums")
	public void user_enters_following_user_details_with_colums(DataTable dataTable) {
	
	List<Map<String,String>> userLists=dataTable.asMaps(String.class,String.class);
//	System.out.println(userLists);
//	System.out.println(userLists.get(0).get("FirstName"));
	for(Map<String,String> e :userLists) {
		System.out.println(e.get("FirstName"));
		System.out.println(e.get("LastName"));
		System.out.println(e.get("Email"));
		System.out.println(e.get("Phone"));
		System.out.println(e.get("City"));
	}
	}

	@Then("user registration should be successfull")
	public void user_registration_should_be_successfull() {
	 
		System.out.println("User registration should be successfull");
	}
	

}
