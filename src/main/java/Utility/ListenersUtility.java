package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtility extends BaseClass implements ITestListener
{
	public void onTestFailure(ITestResult result) 
	{
		String failedmethod = result.getMethod().getMethodName().toString();
		System.out.println(failedmethod);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		String currentTime = LocalDateTime.now().toString().replace(':', '-');
		
		File permanantfile = new File("./src/test/resources/Screenshot"+failedmethod+currentTime+".png");
		try {
			FileHandler.copy(tempfile, permanantfile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	
}
