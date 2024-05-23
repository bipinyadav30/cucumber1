package vtiger.commonpageselements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webutil.WebUtils;

public class CommonPagesElements {
public CommonPagesElements(WebUtils we) {
	PageFactory.initElements(we.driver, this);
}
	
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement usernameTB;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordTB;
	
	@FindBy(xpath = "//input[@name='Login']")
	private WebElement loginBT;
	
	public WebElement getusernameTB() {
		return usernameTB;
	}
	
	
	
	
	
	
	
	public WebElement getpasswordTB() {
		return passwordTB;
	}
	
	public WebElement getloginBT() {
		return loginBT;
	}
	
	
}
