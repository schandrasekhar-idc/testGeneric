package objectRepository;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;
import credentials.loginProperties;

public class DataMiningPage extends ElementLocators
{	
	private String today;
	
	//constructor
	public DataMiningPage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement DataMining()
	{
		return Project.findElement(DataMining);
	}
	
	public void DMreportDownload()
	{
		loginProperties lp = new loginProperties(Project);
		
		//Access Data Mining module
		DataMining().click();
		
		//Default Download Report
		//Project.findElement(DownloadDatamining).click();
	}
	
	// Input date in text format in From and To input boxes
	
	public void DateSelection() throws InterruptedException 
	{
		today=getCurrentDay();
		System.out.println("Today's number: " + today + "\n");
		Project.findElement(DMDateRange).click();	
		Thread.sleep(10000);
		WebElement startDate= Project.findElement(DMDateRangeStartCalendar); 
		try {
			Project.findElement(DMDateRangeStart).click();
			Project.findElement(DMDateRangeStart).clear();
		Project.findElement(DMDateRangeStart).sendKeys("01/12/2021");
		Thread.sleep(5000);
	Project.findElement(DMDateRangeStart).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		Project.findElement(DMDateRangeEnd).click();
		Project.findElement(DMDateRangeEnd).clear();
		
		Project.findElement(DMDateRangeEnd).sendKeys("01/12/2021");
		Thread.sleep(5000);
		Project.findElement(DMDateRangeEnd).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		Project.findElement(DMDateApply).click();
		Thread.sleep(30000);
		Project.findElement(DownloadDatamining).click();
		} catch(StaleElementReferenceException e) {}
	}
		
	
		// Calendar activate and click the date
		/*
		List<WebElement> columns = startDate.findElements(By.xpath("//tbody//td"));
		for (WebElement cell: columns) 
		{
			System.out.println("cell Value is: "+cell.getText());
			if (cell.getText().equals(today)) 
			{
				System.out.println(cell.getText());
				System.out.println(today);
				Thread.sleep(10000);
				//System.out.println(cell.);
				//Project.findElement(By.xpath("//td[text()=]"))
                cell.click();
                Thread.sleep(5000);
                //Project.findElement(DMDateApply).click();
                //Thread.sleep(5000);
                break;
            }
        }
		//
	}
	*/
	private String getCurrentDay ()
	{
        //Create a Calendar Object
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
 
        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt +"\n");
 
        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");
 
        return todayStr;
    }
    
	
}
