package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		plugin = {"pretty", "json:target/json-report/cucumber.json"},
		dryRun = false,
		monochrome = true,
	    tags = "@P0 or @P1"
		)
	

public class TestRunner {

}
