package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class AnalyticsPage extends ElementLocators
{	
	
	
	//constructor
	public AnalyticsPage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement Analytics()
	{
		return Project.findElement(Analytics);
	}
	
	
	
	
	

}
