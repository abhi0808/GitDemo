package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefination {
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test1");
	    
	}
	@When("^User login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test2");

	}
	@And("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Test4");

	   
	}
	@And("^Cards are not displayed$")
    public void cards_are_not_displayed() throws Throwable {
       System.out.println("cards are not displayed");
    }

	}

