package stepDefinition;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import browserSetup.BrowserSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleSearch;
import utils.ReadProperties;

public class GoogleSearchSteps {
	
	
	static WebDriver driver;
	
	ReadProperties rp = new ReadProperties();
	 
	


	
	
//	 @When("I search for {string}") 
//	  public void i_search_for(String Keyword) {
//		  
//		  browser.typeSearchKeyword(Keyword);}
//	  driver.findElement(By.name("q")).sendKeys(Keyword);
//	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER); }
//	  
//	  @Then("I should see search results for {string}") 
//	  public void  i_should_see_search_results_for(String Title) { String
//	  actualTitle=driver.getTitle();
//	  Assert.assertEquals(actualTitle, Title); }
//	  
//
}
