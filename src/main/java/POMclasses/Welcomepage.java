package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	public WebDriver driver;
	
	//initialization
	public Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//declaration
	//@FindAll({
		@FindBy(id="loginBtn")
		//@FindBy(xpath="//button[text()='Login']")
	//})
	private WebElement mainloginbutton;
	
	//getters
	public WebElement getmainloginbutton() {
		return mainloginbutton;
	}
	
	
	
}
