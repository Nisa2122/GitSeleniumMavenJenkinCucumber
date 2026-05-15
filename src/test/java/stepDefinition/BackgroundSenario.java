package stepDefinition;


	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class BackgroundSenario {

		@Given("I navigate to the login page")
		public void i_navigate_to_the_login_page() {
			 System.out.println("****************************************");
		    System.out.println("I navigate to the login page");
		}
		@And("I enter my username")
		public void i_enter_my_username() {
		   
			System.out.println("I enter my username");
		}
		@And("I enter my password")
		public void i_enter_my_password() {
			System.out.println("I enter my password");
		}
		@When("I click on the login button")
		public void i_click_on_the_login_button() {
			System.out.println("I click on the login button");
			System.out.println("****************************************");
		}
		@Then("I should be logged in")
		public void i_should_be_logged_in() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("I should be logged in");
		}
		@Given("I am logged in")
		public void i_am_logged_in() {
			System.out.println("I am logged in");
		}
		@When("I click on the logout button")
		public void i_click_on_the_logout_button() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("I click on the logout button");
		}
		@Then("I should be logged out")
		public void i_should_be_logged_out() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("I should be logged out");
			
		}
	}


