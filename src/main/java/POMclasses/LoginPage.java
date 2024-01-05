package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement emailtextfield;
	
	public WebElement getemailtextfield() {
		return emailtextfield;
	}
	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	
	public WebElement getpasswordtextfield() {
		return passwordtextfield;
	}
	
	@FindBy(id="Login")
	private WebElement logginbutton;
	
	public WebElement getlogginbutton() {
		return logginbutton;
	}
}
