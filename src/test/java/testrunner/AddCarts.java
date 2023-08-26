package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"src/test/resources/appfeatures/AddProduct.feature"},
	glue= {"stepdefinitions"},
	tags="@Smoke",
	plugin={"pretty"}
		)

public class AddCarts {

}
