package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class HomePage extends ElementLocators
{
	
	 
	//constructor
	public HomePage(WebDriver Project) 
	{
		super(Project);
		
	}

	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement HomeLink()
	{
		return Project.findElement(HomeLink);
	}
	
	
	

}
