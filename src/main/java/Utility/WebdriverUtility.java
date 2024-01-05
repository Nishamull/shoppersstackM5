package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	/**Author:Nisha
	 * when we get elementclickInterceptedException(when element is hidden by other elelement)
	 * then we will use javascriptclick
	 * @param driver
	 * @param ele
	 */
	
	//javascript interfacemethods
	public void javaScriptClick(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
	}
	/**Author:Nisha
	 * to avoid elementclickInterceptedexception
	 * @param driver
	 * @param ele
	 */
	
	public void javascriptsendkeys(WebDriver driver, WebElement ele, String data) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value=arguments[1];", ele, data);
	}
	/**Author:Nisha
	 * this method is use to scroll the webpage tillthe given webelement
	 * @param driver
	 * @param ele
	 */
	
	public void javascriptscrolltillwebelement(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollInToView(true);", ele);
	}
	/**Author:Nisha
	 * this method is use to scroll the webpage with given co-ordinates
	 * @param xco
	 * @param yco
	 */
	
	public void javascriptbycordinates(WebDriver driver, int xco, int yco) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy("+xco+","+yco+");");
	}
	/**Author: Nisha
	 * Highlighting webelement border
	 * @param driver
	 * @param ele
	 */
	
	public void javascripthighlightwebelement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("argumrents[0].style.border='2px solid blue';",ele);	
	}
	
	//explicitly wait methods
	/**
	 * this method will wait until given element reaches to click able state
	 * @param locator
	 * @param driver
	 * @param timenseconds
	 */
		public void explicitlyWaitforElementclickable(By locator,WebDriver driver,int timenseconds) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timenseconds));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		
		/**
		 * this method will wait until alert is present
		 * @param locator
		 * @param driver
		 * @param timenseconds
		 */
		
		public void explicitlywaitforalerttobepresent(WebDriver driver,int timenseconds) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timenseconds));
			wait.until(ExpectedConditions.alertIsPresent());
		}
		
		/**
		 * this method will wait until complete URL is visible
		 * @param locator
		 * @param driver
		 * @param timenseconds
		 */
		
		public void explicitlywaitforurlTobepresent(WebDriver driver,int timenseconds,String completeurl) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timenseconds));
			wait.until(ExpectedConditions.urlToBe(completeurl));
		}
		
		/**
		 * this method will wait until given elemenet is visible
		 * @param locator
		 * @param driver
		 * @param timenseconds
		 */
		public void explicitlywaitforvisibilityofelement(WebDriver driver,int timenseconds,WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timenseconds));
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		
		/**
		 * this method will wait until Title is visible
		 * @param locator
		 * @param driver
		 * @param timenseconds
		 */
		public void explicitlywaitforTitletobepresent(WebDriver driver,int timenseconds,String completeTilte) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timenseconds));
			wait.until(ExpectedConditions.titleIs(completeTilte));
		}
		
		//select class methods
		public void selectdropdownbytext(WebDriver driver,WebElement selectTag,String textvalue) {
			Select select = new Select(selectTag);
			select.selectByVisibleText(textvalue);
		}
		
		public void deselectdropdownbytext(WebElement selectTag,String valueattributevalue) {
			Select select = new Select(selectTag);
			select.deselectByVisibleText(valueattributevalue);
		}
		
		public void selectdropdownbyvalueofvalueAttribute(WebElement selectTag,String valueattributevalue) {
			Select select = new Select(selectTag);
			select.selectByValue(valueattributevalue);
		}
		
		public void deselectdropdownbyvalueofvalueAttribute(WebElement selectTag,String valueattributevalue) {
			Select select = new Select(selectTag);
			select.deselectByValue(valueattributevalue);
		}
		
		//Actions class methods
		/**
		 * to perfprm mouseover operation on web element
		 * @param driver
		 * @param ele
		 */
		public void actionsmouseoveringaction(WebDriver driver, WebElement ele) {
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
		}
		/**
		 * to perfprm double click on web element
		 * @param driver
		 * @param ele
		 */
		
		public void actionsdoublieclickonsebelement(WebDriver driver, WebElement ele) {
			Actions action = new Actions(driver);
			action.doubleClick(ele).perform();
		}
		
		/**
		 * to perfprm right click on web element
		 * @param driver
		 * @param ele
		 */
		
		public void actionclassrightclick(WebDriver driver,WebElement ele) {
			Actions action = new Actions(driver);
			action.contextClick(ele).perform();
			}
		
		/**
		 * to perfprm drag and drop operation between 2 elements
		 * @param driver
		 * @param ele
		 */
		
		public void actiondragndrop(WebDriver driver, WebElement source, WebElement destination) {
			Actions action = new Actions(driver);
			action.dragAndDrop(source, destination).perform();
		}
		
		/**
		 * to perfprm click and hold operation on webelement 
		 * @param driver
		 * @param ele
		 */
		
		public void actionclickandhold(WebDriver driver, WebElement ele) {
			Actions action = new Actions(driver);
			action.clickAndHold(ele).perform();
		}
		
		/**
		 * to perfprm scrolling of webpage till the  webelement 
		 * @param driver
		 * @param ele
		 */
		public void scrollToWebElement(WebDriver driver, WebElement ele) {
			Actions action = new Actions(driver);
			action.scrollToElement(ele).perform();
		}
		
		
}
