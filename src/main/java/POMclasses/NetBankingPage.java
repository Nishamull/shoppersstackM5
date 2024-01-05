package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetBankingPage {
 public WebDriver driver;
 public NetBankingPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 
 
// @FindAll({@FindBy(xpath="//iframe[@title='Netbanking']"), @FindBy(xpath="//iframe[@src='/select-bank?total=1036']")})
 @FindBy(xpath="//iframe[@title='Netbanking']")
 private WebElement netbankingframetag;
 
 public WebElement getnetbankingframetag() {
	 return netbankingframetag;
 }
 
 @FindAll({ @FindBy(xpath="//span[text()='IDHC']"),@FindBy(xpath="//input[@value='IDHC']")})
 private WebElement IDHCradiobutton;
 
 public WebElement getIDHCradiobutton() {
	 return IDHCradiobutton;
 }

 @FindBy(xpath="//button[text()='Submit']")
 private WebElement submitbutton;
 
 public WebElement getsubmitbutton() {
	 return submitbutton;
 }
 
}
