package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class DomainBlacklistPage extends ElementLocators
{	
	
	
	//constructor
	public DomainBlacklistPage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement DomainBlacklist()
	{
		return Project.findElement(DomainBlacklist);
	}
	
	
	
	
	

}
