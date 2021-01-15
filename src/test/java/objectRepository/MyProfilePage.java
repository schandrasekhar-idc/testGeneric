package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.ElementLocators;

public class MyProfilePage extends ElementLocators
{	
	
	
	//constructor
	public MyProfilePage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement MyProfile()
	{
		return Project.findElement(MyProfile);
	}
	
	
	
	
	

}
