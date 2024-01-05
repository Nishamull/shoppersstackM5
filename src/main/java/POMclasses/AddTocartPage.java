package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTocartPage {

	public WebDriver driver;
	
	public AddTocartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Levis Mens Regular Fit Tee']")
	private WebElement levisProduct;
	
	public WebElement getlevisProduct() {
		return levisProduct;
	}
	
	@FindBy(xpath="//span[text()='Buy Now']")
	private WebElement bynowbuttoninaddtocartpage;
	
	public WebElement getbynowbuttoninaddtocartpage() {
		return bynowbuttoninaddtocartpage;
	}
}
