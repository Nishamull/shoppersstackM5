package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodpage {
	
	public WebDriver driver;
	public PaymentMethodpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Cash On Delivery (COD)']")
	private WebElement cashOnDelivaryradiobutton ;
	
	public WebElement getcashOnDelivaryradiobutton() {
		return cashOnDelivaryradiobutton; 
	}
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedbutton ;
	
	public WebElement getproceedbutton() {
		return proceedbutton; 
	}
	
	@FindBy(xpath="//span[text()='Net Banking']")
	private WebElement netbankingradiobutton ;
	
	public WebElement getnetbankingradiobutton() {
		return netbankingradiobutton; 
	}
}
