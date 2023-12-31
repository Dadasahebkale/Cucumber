package stepdefinitions;



import amazonimplementation.Product;
import amazonimplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testrunner.AmazoneTest;

public class SearchSteps{
	Product product;
	Search search;
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    System.out.println("Step 1: I am on search page");
	}

	@When("I Search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
	System.out.println("Step 2: Search the product with name : "+productName+" price :"+price);
		
	product=new Product(productName,price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    
		System.out.println("Step 3: product "+productName+" is displayed");
		search=new Search();
	    String name= search.displayProduct(product);
	    System.out.println("Search product is : "+name);
	 
	}
	@Then("Order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer orderid, String username) {
		System.out.println("User id is "+orderid);
		System.out.println("User name is "+username);
	    
	}

}
