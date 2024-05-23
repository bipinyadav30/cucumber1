package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testrahul {
	@Given("chromebrowser is open")
	public void launchBrowser() {
		System.out.println("chrome browser launch");
	}
	
	@When("user should be on login page")
	public void user_should_be_on_login_page() {
		System.out.println("user on login page");

	}

	@When("enter valid credential")
	public void enter_valid_credential() {
		System.out.println("enter valid credential");
 
	}

	@Then("verify the  login page")
	public void verify_the_login_page() {
		System.out.println("verify login page");
 
	}

}
