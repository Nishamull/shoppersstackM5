package Utility;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JavaUtility  {
	
	
	public int generateRandom(int range) {
		Random random = new Random(range);
		int ranNumber = random.nextInt();
		return ranNumber;
	}
	
	
}
