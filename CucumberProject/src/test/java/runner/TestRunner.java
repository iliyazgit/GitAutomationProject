package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)

@CucumberOptions(
		
		features= {"features"},
		glue = {"com.rediff.stepdefinitions"},
	
		tags= {"@RediffLogin"},
		dryRun=false,	monochrome=true)
public class TestRunner {

}
