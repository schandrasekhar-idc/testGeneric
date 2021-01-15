package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class CustomizeEmailPage extends ElementLocators
{	
	
	
	//constructor
	public CustomizeEmailPage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement CustomizeEmail()
	{
		return Project.findElement(CustomizeEmail);
	}
	
	
	
	
	

}
