package stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonHomePageSteps {

	@Given("User is on Amazon home page")
	public void user_is_on_amazon_home_page() {
	   
	}

	@Then("User gets a Amazon search field")
	public void user_gets_a_amazon_search_field() {
	   
	}

	@Then("Username is also displayed next to search field")
	public void username_is_also_displayed_next_to_search_field() {
	    
	}

	@Then("Amazon logo is also displayed")
	public void amazon_logo_is_also_displayed() {
	    
	}

	@Then("Cart link is also displayed")
	public void cart_link_is_also_displayed() {
	    
	}

	@When("User scrolls down to Todays Deals section")
	public void user_scrolls_down_to_todays_deals_section() {
	    
	}

	@Then("User gets the list of multiple products")
	public void user_gets_the_list_of_multiple_products() {
	    
	}

	@Then("User gets product image and price details")
	public void user_gets_product_image_and_price_details() {
	    
	}

	@Then("User can see more products by clicking on carousel")
	public void user_can_see_more_products_by_clicking_on_carousel() {
	    
		
	}

	@When("User scrolls down to footer of the page")
	public void user_scrolls_down_to_footer_of_the_page() {
	    
	}

	@Then("User gets all Country links")
	public void user_gets_all_country_links(DataTable dataTable) {
		List<List<String>> countrylist=	dataTable.asLists();
		System.out.println(countrylist);
	}

	@Then("User gets all amazon services links")
	public void user_gets_all_amazon_services_links(DataTable dataTable) {
		List<List<String>> serviceLists=dataTable.asLists();  
		System.out.println(serviceLists);
	}

	@Then("User gets all privacy policy links")
	public void user_gets_all_privacy_policy_links(DataTable dataTable) {
		List<List<String>> privacylinks=dataTable.asLists();
		System.out.println(privacylinks);
	}
}
