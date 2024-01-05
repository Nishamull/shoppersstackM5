package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {

	public WebDriver driver;
	public OrderConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Order Confirmed']")
	private WebElement ordercongirmed;
	
	public WebElement getordercongirmed() {
		return ordercongirmed;
	}
}
