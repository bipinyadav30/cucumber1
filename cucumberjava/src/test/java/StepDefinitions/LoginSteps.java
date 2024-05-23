package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver=null;

	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","D:\\study materials\\workspacebipin\\cucumberjava\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}


	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("http://localhost:8888/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		Thread.sleep(3000);
	}

	@And("click on login  button")
	public void click_on_login_button() {
		driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	System.out.println(driver.getPageSource().contains("Marketing"));
	}

}
