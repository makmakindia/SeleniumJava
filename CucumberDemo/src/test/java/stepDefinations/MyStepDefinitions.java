package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("NAvigate to Login page ");
	}

	@When("^User login into application with input \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_input_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Login  Details : "+"User : "+arg1+"	Password : "+arg2 );
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Navigated to Home page ");
	}

	@Then("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed(String arg1) throws Throwable {
	   System.out.println(" Card Details available : "+arg1);
	}

}