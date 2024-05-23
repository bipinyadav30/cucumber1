 package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver=null;
	
	@Given("browsern is open")
	public void browsern_is_open() {
		String projectPath=System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    driver.navigate().to("https://google.com/");
	    
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("hit enters")
	public void hit_enters() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigate to search result")
	public void user_is_navigate_to_search_result() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
