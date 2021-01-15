package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class URLPage extends ElementLocators
{	
	
	
	//constructor
	public URLPage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement URL()
	{
		return Project.findElement(URL);
	}
	
	
	
	
	

}
