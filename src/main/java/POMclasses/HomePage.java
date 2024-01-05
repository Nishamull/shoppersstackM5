package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[name()='svg' and @data-testid='SettingsIcon']")
	private WebElement settingicon;
	
	public WebElement getsettingicon() {
		return settingicon;
	}
	
	@FindBy(xpath="//a[text()='Men']")
	private WebElement menlink;
	
	public WebElement getmenlink() {
		return menlink;
	}
	
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement Tshirtlink;
	
	public WebElement getTshirtlink() {
		return Tshirtlink;
	}
		
		@FindBy(id="cart")
		private WebElement addTocarticon;
		
		public WebElement getaddTocarticon() {
			return addTocarticon;
	}
		
//		public void javascriptclick(WebDriver driver) {
//			WebElement ele = driver.findElement(By.xpath("//button[@aria-label='Account setting"));
//		
//			JavascriptExecutor jse = (JavascriptExecutor)driver;
//			jse.executeScript("arguments[0].click();", ele);
//		}
}
