package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyaddressesPage {

	public WebDriver driver;
	public MyaddressesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressbutton;
	
	public WebElement getaddAddressbutton() {
		return addAddressbutton;
	}
	
	@FindBy(xpath="//div[@class='addressListContainer']//h3")
	private WebElement addedAddress;
	
	public WebElement getaddedAddress() {
		return addedAddress;
	}
}
