package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetBankingLoginPage {

	public WebDriver driver;
	public NetBankingLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//these are nested frames and this is main parent frmae netbanking
	@FindBy(xpath="//iframe[@title='Netbanking']")
	//@FindAll({@FindBy(xpath="//iframe[@src='/select-bank?total=1036'])"),@FindBy(xpath="//iframe[@title='Netbanking']")})
	//@FindBy(xpath="//iframe[@src='/select-bank?total=1036'])")
	private WebElement Netbankingparentfrme;
	
	public WebElement getNetbankingparentfrme() {
		return Netbankingparentfrme;
	}
	
	//this is child frame netbanking login this contains username and password and submit buttton
	@FindBy(xpath="//iframe[@title='Netbanking Login']")
	private WebElement netbankingloginchildframe;
	
	public WebElement getnetbankingloginchildframe() {
		return netbankingloginchildframe;
	}
	
	@FindBy(id="User ID-label")
	private WebElement netbankingloginusername;
	
	public WebElement getnetbankingloginusername() {
		return netbankingloginusername;
	}
	
	@FindBy(id="Password")
	private WebElement netbankingloginpassword;
	
	public WebElement getnetbankingloginpassword() {
		return netbankingloginpassword;
	}
	
	@FindBy(id="Submit")
	private WebElement netbankingloginsublitbutton;
	
	public WebElement getnetbankingloginsublitbutton() {
		return netbankingloginsublitbutton;
	}
	
	//this is child frame of netbanking login frame
	@FindBy(xpath="	//iframe[@src='/pay-amount-frame?total=1036&number=741852964479']")
	private WebElement payamountparentframe;
	
	public WebElement getpayamountparentframe() {
		return payamountparentframe;
	}
	
	//this is child frame of pay amount frame whic contains paynow button
	@FindBy(xpath="//iframe[@title='Pay Amount']")
	private WebElement payamountchildframe;
	
	public WebElement getpayamountchildframe() {
		return payamountchildframe;
	}
	
	@FindBy(xpath="//button[text()='Pay Now']")
	private WebElement paynowbutton;
	
	public WebElement getpaynowbutton() {
		return paynowbutton;
	}
	
	
}
