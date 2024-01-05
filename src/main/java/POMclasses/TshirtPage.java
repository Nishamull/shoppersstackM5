package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPage {

	public WebDriver driver;
	public TshirtPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='men tshirt']")
	private WebElement tshirtToplink;
	
	public WebElement gettshirtToplink() {
		return tshirtToplink;
	}
	
	@FindBy(xpath="//span[text()='Levis Mens Regular Fit Tee']/../..//button")
	private WebElement levismensRegularfitproduct_Addtocartbutton;
	
	public WebElement getlevismensRegularfitproduct_Addtocartbutton() {
		return levismensRegularfitproduct_Addtocartbutton;
	}
}
