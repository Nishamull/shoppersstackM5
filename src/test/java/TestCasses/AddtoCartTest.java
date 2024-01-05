package TestCasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMclasses.AccountsettingPage;
import POMclasses.AddTocartPage;
import POMclasses.AddressFormpage;
import POMclasses.AdressPage;
import POMclasses.HomePage;
import POMclasses.MyProfilepage;
import POMclasses.MyaddressesPage;
import POMclasses.NetBankingLoginPage;
import POMclasses.NetBankingPage;
import POMclasses.OrderConfirmationPage;
import POMclasses.PaymentMethodpage;
import POMclasses.TshirtPage;
import Utility.BaseClass;
import Utility.DataUtility;
@Listeners(Utility.ListenersUtility.class)
public class AddtoCartTest extends BaseClass {
	
	@Test(dataProvider="dataProviderAddress")
	public void Tc_addAdress_001_Test(String name,String house,String street,String landmark,String country,
			String state,String city,String pincode,String mobnum) throws Throwable {
		System.out.println("add Address");
		HomePage hp = new HomePage(driver);
		//wdu.javaScriptClick(driver, hp.getsettingicon());
		hp.getsettingicon().click();
		Thread.sleep(2000);
		
		AccountsettingPage asp = new AccountsettingPage(driver);
		//wdu.javaScriptClick(driver, asp.getmyprofilelink());
		asp.getmyprofilelink().click();
		Thread.sleep(2000);
	
		Assert.assertEquals(driver.getCurrentUrl(), "https://shoppersstack.com/my-profile/my-profile-info");
		System.out.println("the my profile page is open");
		Thread.sleep(2000);
		MyProfilepage mfp = new MyProfilepage(driver);
		mfp.getmyaddresslink().click();
		
		Thread.sleep(2000);
		MyaddressesPage map = new MyaddressesPage(driver);
		map.getaddAddressbutton().click();
		Thread.sleep(2000);
		
		AddressFormpage afp = new AddressFormpage(driver);
		afp.getnametextfield().sendKeys(name);
		Thread.sleep(1000);
		
		afp.gethousetextfield().sendKeys(house);
		
		afp.getstreetinfotextfield().sendKeys(street);
		Thread.sleep(1000);
		
		afp.getlandmarktextfield().sendKeys(landmark);
		Thread.sleep(1000);
		
		WebElement countrydd = afp.getcountrydropdown();
		Thread.sleep(1000);
		
		ddu.selectdropdownbytext(countrydd, country);
		Thread.sleep(1000);
		
		ddu.selectdropdownbytext(afp.getstatedropdown(), state);
		Thread.sleep(1000);
		
		ddu.selectdropdownbytext(afp.getcitydropdown(), city);
		Thread.sleep(1000);
		
		afp.getpincodetextfield().sendKeys(pincode);
		Thread.sleep(1000);
		
		afp.getphonenumbertextfield().sendKeys(mobnum);
		Thread.sleep(1000);
		
		afp.getaddAddressbutton().click();
		
	Assert.assertEquals(map.getaddedAddress().getText(), name); 
	System.out.println("the addressm -"+name+" is added successfully");
	}
	
	@DataProvider
	public Object[][] dataProviderAddress() throws Throwable{
		Object[][] ref = new Object[1][9];
		
		ref[0][0]="NishaBegumMulla";
		ref[0][1]="QSpiders Hebbal";
		ref[0][2]="MahatmaGandhi Road";
		ref[0][3]="SBI School";
		ref[0][4]="India";
		ref[0][5]="Karnataka";
		ref[0][6]="Bengaluru";
		ref[0][7]="560010";
		ref[0][8]="9538835108";
		Thread.sleep(5000);
		
//		ref[0][0]="sdet";
//		ref[0][1]="JSpiders Hebbal";
//		ref[0][2]="MahatmaGandhi Road";
//		ref[0][3]="SBI Bank";
//		ref[0][4]="India";
//		ref[0][5]="Karnataka";
//		ref[0][6]="Bengaluru";
//		ref[0][7]="560010";
//		ref[0][8]="9538835199";
//		Thread.sleep(5000);
		return ref;
		
	}
	
	//@Test(dependsOnMethods="Tc_addAdress_001_Test")
	public void Tc_addtocart_002_Test() throws Throwable {
//	String data = du.datafromPropertiesfile("Url"); username
//	System.out.println(data);
//	
//	String exceldata = du.datafromExcelfile("Sheet1", 0, 1);
//	System.out.println(exceldata);
		Thread.sleep(3000);
		String homepagetitle = driver.getTitle();
		Assert.assertEquals(homepagetitle, "ShoppersStack | Home");
		System.out.println("first test case");
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		WebElement menlink1 = hp.getmenlink();
		wdu.actionsmouseoveringaction(driver, menlink1);
		hp.getTshirtlink().click();
		Thread.sleep(2000);
		
		TshirtPage tsp = new TshirtPage(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://shoppersstack.com/sub-category/men-tshirt");
		wdu.actionsmouseoveringaction(driver,tsp.gettshirtToplink());
		
		Thread.sleep(2000);
		tsp.getlevismensRegularfitproduct_Addtocartbutton().click();
		Thread.sleep(2000);
		hp.getaddTocarticon().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://shoppersstack.com/cart");
		System.out.println("the cart page has opened");
		
		Thread.sleep(2000);
		AddTocartPage ac = new AddTocartPage(driver);
		String levisProductest = ac.getlevisProduct().getText();
		Assert.assertEquals(levisProductest,"Levis Mens Regular Fit Tee");
		System.out.println("the product is added to the cart");
		ac.getbynowbuttoninaddtocartpage().click();
		Thread.sleep(2000);
		String addrespageurl = driver.getCurrentUrl();
		Assert.assertEquals(addrespageurl, "https://shoppersstack.com/selectaddress");
		System.out.println("the product adress page is displayed");
		
		AdressPage ap =new AdressPage(driver);
		ap.getfirstaddressradiobutton().click();
		Thread.sleep(2000);
		ap.getproceedbutton().click();
		Thread.sleep(2000);
		
		PaymentMethodpage pm = new PaymentMethodpage(driver);
		pm.getcashOnDelivaryradiobutton().click();
		Thread.sleep(2000);
		pm.getproceedbutton().click();
		Thread.sleep(2000);
		OrderConfirmationPage oc = new OrderConfirmationPage(driver);
		Assert.assertEquals(oc.getordercongirmed().getText(), "Order Confirmed");
		System.out.println("the order got confirmed on cash on delivery");
		
		
	}
	
	//@Test
	public void Tc_addtocart_003_Test() {
		System.out.println("2nd test case");
	}
	
	//@Test
	public void EndtoEnd_Netbanking() throws Throwable {
		Thread.sleep(3000);
		String homepagetitle = driver.getTitle();
		Assert.assertEquals(homepagetitle, "ShoppersStack | Home");
		System.out.println("first test case");
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		WebElement menlink1 = hp.getmenlink();
		wdu.actionsmouseoveringaction(driver, menlink1);
		hp.getTshirtlink().click();
		Thread.sleep(2000);
		
		TshirtPage tsp = new TshirtPage(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://shoppersstack.com/sub-category/men-tshirt");
		wdu.actionsmouseoveringaction(driver,tsp.gettshirtToplink());
		
		Thread.sleep(2000);
		tsp.getlevismensRegularfitproduct_Addtocartbutton().click();
		Thread.sleep(2000);
		hp.getaddTocarticon().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://shoppersstack.com/cart");
		System.out.println("the cart page has opened");
		
		Thread.sleep(2000);
		AddTocartPage ac = new AddTocartPage(driver);
		String levisProductest = ac.getlevisProduct().getText();
		Assert.assertEquals(levisProductest,"Levis Mens Regular Fit Tee");
		System.out.println("the product is added to the cart");
		ac.getbynowbuttoninaddtocartpage().click();
		Thread.sleep(2000);
		String addrespageurl = driver.getCurrentUrl();
		Assert.assertEquals(addrespageurl, "https://shoppersstack.com/selectaddress");
		System.out.println("the product adress page is displayed");
		
		AdressPage ap =new AdressPage(driver);
		ap.getfirstaddressradiobutton().click();
		Thread.sleep(2000);
		ap.getproceedbutton().click();
		Thread.sleep(2000);
		
		PaymentMethodpage pm = new PaymentMethodpage(driver);
		pm.getnetbankingradiobutton().click();
		Thread.sleep(2000);
		pm.getproceedbutton().click();
		Thread.sleep(2000);
		
		NetBankingPage abp = new NetBankingPage(driver);
		driver.switchTo().frame(abp.getnetbankingframetag());
		Thread.sleep(2000);
		//wdu.javaScriptClick(driver, abp.getIDHCradiobutton());
		abp.getIDHCradiobutton().click();
		Thread.sleep(2000);
		abp.getsubmitbutton().click();
		Thread.sleep(2000);
		
		NetBankingLoginPage nblp = new NetBankingLoginPage(driver);
		Thread.sleep(1000);
		driver.switchTo().frame(nblp.getNetbankingparentfrme());
		Thread.sleep(1000);
		driver.switchTo().frame(nblp.getnetbankingloginchildframe());
		Thread.sleep(1000);
		String uname = du.datafromPropertiesfile("username");
		nblp.getnetbankingloginusername().sendKeys(uname);
		Thread.sleep(1000);
		String pword = du.datafromPropertiesfile("password");
		nblp.getnetbankingloginpassword().sendKeys(pword);
		Thread.sleep(1000);
		nblp.getnetbankingloginsublitbutton().click();
	}
}
