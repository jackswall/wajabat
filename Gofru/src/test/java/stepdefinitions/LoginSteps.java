package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user in login page")
	public void user_in_login_page() {
		System.out.println("l ");
		
	}

	@When("usre enters username and password")
	public void usre_enters_username_and_password() {
		System.out.println("o ");
		
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("g ");
		
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
		System.out.println("n ");
		
	}
}
