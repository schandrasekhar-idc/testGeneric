package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class ManageTemplatePage extends ElementLocators
{	
	
	
	//constructor
	public ManageTemplatePage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement ManageTemplate()
	{
		return Project.findElement(ManageTemplate);
	}
	
	
	
	
	

}
