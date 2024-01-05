package Utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtility {

	//select class methods
			public void selectdropdownbytext(WebElement selectTag,String textvalue) {
				Select select = new Select(selectTag);
				select.selectByVisibleText(textvalue);
			}
			
			public void selectdropdownbyIndext(WebElement selectTag,int index) {
				Select select = new Select(selectTag);
				select.deselectByIndex(index);
			}
		
			public void selectdropdownbyvalueofvalueAttribute(WebElement selectTag,String valueattributevalue) {
				Select select = new Select(selectTag);
				select.selectByValue(valueattributevalue);
			}
			
			public void deselectdropdownbytext(WebElement selectTag,String valueattributevalue) {
				Select select = new Select(selectTag);
				select.deselectByVisibleText(valueattributevalue);
			}
			
			public void deselectdropdownbyvalueofvalueAttribute(WebElement selectTag,String valueattributevalue) {
				Select select = new Select(selectTag);
				select.deselectByValue(valueattributevalue);
			}
			
			public void deselectdropdownbyIndext(WebElement selectTag,int index) {
				Select select = new Select(selectTag);
				select.deselectByIndex(index);
			}
			
			public ArrayList togetAlloptionsText(WebElement selectTagofdropdown) {
				Select select = new Select(selectTagofdropdown);
				List<WebElement> alloptions = select.getOptions();
				ArrayList<String> alloptionsText = new ArrayList<String>();
				for(WebElement ele : alloptions) {
					alloptionsText.add(ele.getText());
					}
				return alloptionsText;
			}
			
			public WebElement togetperticularOptiononIndex(WebElement selectTagofdropdown, int indexofoption) {
				Select select = new Select(selectTagofdropdown);
				List<WebElement> alloptions = select.getOptions();
				WebElement particularoptionwebelement = alloptions.get(indexofoption);
				return particularoptionwebelement;
			}
}
