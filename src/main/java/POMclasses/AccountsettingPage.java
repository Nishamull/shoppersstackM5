package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsettingPage {
	public WebDriver driver;

	public AccountsettingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[name()='svg' and @data-testid='LogoutIcon']")
	private WebElement logoutbutton;
	
	public WebElement getlogoutbutton() {
		return logoutbutton;
	}
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myprofilelink;
	
	public WebElement getmyprofilelink() {
		return myprofilelink;
	}
}
