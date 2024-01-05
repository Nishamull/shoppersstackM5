package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdressPage {

	public WebDriver driver;
	public AdressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/addressform']")
	private WebElement addAdressform;
	
	public WebElement getaddAdressform() {
		return addAdressform;
	}
	
	@FindBy(xpath="//strong[text()='NishaBegumMulla']/../../..//input")
	private WebElement firstaddressradiobutton;
	
	public WebElement getfirstaddressradiobutton() {
		return firstaddressradiobutton;
	}
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedbutton;
	
	public WebElement getproceedbutton() {
		return proceedbutton;
	}
}
