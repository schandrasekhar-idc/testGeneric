package objectRepository;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//import Locators.ElementLocators;



public class TakeScreenShot {

	@Test
	//constructor
	public TakeScreenShot()
	{
		
		System.out.println("SCREEN SHOT CONSTRUCTOR");
		
	}
	
	public void screenshot (WebDriver ToolDriver, String ToolName,String Page)throws IOException, InterruptedException
	{
		// Convert web driver object to TakeScreenshot

				TakesScreenshot scrShot = ((TakesScreenshot) ToolDriver);

				// Call getScreenshotAs method to create image file

				File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

				// Move image file to new destination
				String fileWithPath = "C:\\sarath_eclipse\\Screeshots\\";

				File DestFile = new File(fileWithPath + ToolName +Page+" - " + System.currentTimeMillis() + ".png");

				// Copy file at destination

				FileUtils.copyFile(SrcFile, DestFile);

	}
	

}
