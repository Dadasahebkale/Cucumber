package stepdefinitions;

import amazonimplementation.AddToCart;
import amazonimplementation.BatteryTypes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonAddCarts {
	BatteryTypes types;
	AddToCart cart;
	
	@Given("I want add {string} in the add cart")
	public void i_want_add_in_the_add_cart(String productName) {
	   System.out.println("I successfull added "+productName+ " at the cart");
	   
	}

	@When("I want add {string} with size {int} mAh")
	public void i_want_add_with_size_m_ah(String productName, Integer price) {
	  System.out.println("I got option for my desired "+productName+" on size no "+ price+" with mAh");
	  types=new BatteryTypes();
	  cart=new AddToCart(productName,price);
	}

	@Then("Product name with {string} battery size it needs to add into cart")
	public void product_name_with_battery_size_it_needs_to_add_into_cart(String productName) {
	   System.out.println(productName+ " and Apple 14 pro has been added");
	   types=new BatteryTypes();
	   types.DisplayBatteryList(cart);
	   
	}
}
