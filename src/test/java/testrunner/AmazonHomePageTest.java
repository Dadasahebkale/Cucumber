package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/appfeatures/AmazonHomePage.feature"},
		glue= {"stepdefinitions"},
		plugin= {"pretty",
		"json:target/MyReports/report.json",
		"junit:target/MyReports/report.xml"
		},
		publish=true
		
		)
public class AmazonHomePageTest {

}
