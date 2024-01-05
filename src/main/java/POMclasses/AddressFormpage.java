package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormpage {

	public WebDriver driver;
	public AddressFormpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Home")
	private WebElement homeradiobutton;
	
	public WebElement gethomeradiobutton() {
		return homeradiobutton;
	}
		
		@FindBy(id="Name")
		private WebElement nametextfield;
		
		public WebElement getnametextfield() {
			return nametextfield;
	}
		
		@FindBy(id="House/Office Info")
		private WebElement housetextfield;
		
		public WebElement gethousetextfield() {
			return housetextfield;
	}
		
		@FindBy(id="Street Info")
		private WebElement streetinfotextfield;
		
		public WebElement getstreetinfotextfield() {
			return streetinfotextfield;
	}
		
		@FindBy(id="Landmark")
		private WebElement landmarktextfield;
		
		public WebElement getlandmarktextfield() {
			return landmarktextfield;
	}
		
		@FindBy(id="Pincode")
		private WebElement pincodetextfield;
		
		public WebElement getpincodetextfield() {
			return pincodetextfield;
	}
		
		@FindBy(id="Phone Number")
		private WebElement phonenumbertextfield;
		
		public WebElement getphonenumbertextfield() {
			return phonenumbertextfield;
	}
		
		@FindBy(xpath="//button[text()='Add Address']")
		private WebElement addAddressbutton;
		
		public WebElement getaddAddressbutton() {
			return addAddressbutton;
	}
		
		@FindBy(id="Country")
		private WebElement countrydropdown;
		
		public WebElement getcountrydropdown() {
			return countrydropdown;
	}
		
		@FindBy(id="State")
		private WebElement statedropdown;
		
		public WebElement getstatedropdown() {
			return statedropdown;
		}
		
		@FindBy(id="City")
		private WebElement citydropdown;
		
		public WebElement getcitydropdown() {
			return citydropdown;
		}
}
