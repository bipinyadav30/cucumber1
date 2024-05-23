package webutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebUtils {
public WebDriver driver;

public void launchBrowser(String url) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.navigate().to(url);
}

public void mySendkeys(WebElement we,String value) {
		we.sendKeys(value);
		
	}
public void myClick(WebElement we) {
	we.click();
}

}
