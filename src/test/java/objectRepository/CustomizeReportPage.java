package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class CustomizeReportPage extends ElementLocators
{	
	
	
	//constructor
	public CustomizeReportPage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement CustomizeReport()
	{
		return Project.findElement(CustomizeReport);
	}
	
	
	
	
	

}
