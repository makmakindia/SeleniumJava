package CucumberOptions;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Provide Feature file 
// stepDefinitions 
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features",
		glue="stepDefinations"
		)

public class TestRunner {

}
