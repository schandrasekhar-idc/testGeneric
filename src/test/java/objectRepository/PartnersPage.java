package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class PartnersPage extends ElementLocators
{	
	
	
	//constructor
	public PartnersPage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement Partners()
	{
		return Project.findElement(Partners);
	}
	
	public WebElement ProjectCompliance()
	{
		return Project.findElement(Compliance);
	}
	
	public WebElement ProjectEdit()
	{
		return Project.findElement(Edit);
	}

	
	
	
	
	
	

}
