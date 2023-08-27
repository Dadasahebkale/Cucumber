package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/appfeatures/Uber.feature"},
		glue= {"stepdefinitions"},
		tags="@All",
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"},
		publish=true,
		//monochrome=true
		dryRun=true
		//strict=true- With version 6, Cucumber-JVM will default to --strict mode
		)

public class UberTest {

}
