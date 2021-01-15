package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class CampaignPage extends ElementLocators
{	
	
	
	//constructor
	public CampaignPage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement Campaign()
	{
		return Project.findElement(Campaign);
	}
	
	
	
	
	

}
