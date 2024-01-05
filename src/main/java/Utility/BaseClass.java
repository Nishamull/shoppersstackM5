package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POMclasses.AccountsettingPage;
import POMclasses.HomePage;
import POMclasses.LoginPage;
import POMclasses.Welcomepage;

public class BaseClass {
	public static WebDriver driver;
	public DataUtility du = new DataUtility();
	public WebdriverUtility wdu = new WebdriverUtility();
	public DropdownUtility ddu = new DropdownUtility();
	
	@BeforeClass
	public void launchingBrowser() throws Throwable {
	System.out.println("--------LaunchingBrowser------");	
		String BRWOSER = du.datafromPropertiesfile("browser");
		
		if(BRWOSER.equals("chrome")){
			driver = new ChromeDriver();
		}
		
		else if(BRWOSER.equals("firefox")) {
			driver = new FirefoxDriver(); 
		}
		
		else if(BRWOSER.equals("edge")) {
		driver = new EdgeDriver();	
		}
		
		else {
			driver = new ChromeDriver();
		}
		
		String URL = du.datafromPropertiesfile("Url");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	@BeforeMethod
	public void loginToApplicstion() throws Throwable {
		System.out.println("-----LoginToapplication-------");
		Welcomepage wp = new Welcomepage(driver);
		wp.getmainloginbutton().click();
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		String emailid = du.datafromPropertiesfile("email"); //given in credentials 
		lp.getemailtextfield().sendKeys(emailid); //use to send data to username
		Thread.sleep(2000);
		String pw = du.datafromPropertiesfile("password");
		lp.getpasswordtextfield().sendKeys(pw);
		Thread.sleep(2000);
		lp.getlogginbutton().click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logoutFromApplication() throws Throwable {
		System.out.println("-------LogoutFromApplication-------");
		Thread.sleep(6000);
		HomePage hp = new HomePage(driver);
		 hp.getsettingicon().click();
		Thread.sleep(2000);
		
		AccountsettingPage asp = new AccountsettingPage(driver);
		//wdu.javaScriptClick(driver, asp.getlogoutbutton());
		asp.getlogoutbutton().click();
	}
	
	@AfterClass
	public void quitBrowser() {
		System.out.println("-------quit the browser--------");
		//driver.quit();
	}
}
