package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import credentials.ElementLocators;

public class LoginPage extends ElementLocators
{
	
	public LoginPage(WebDriver Project) 
	{
		super(Project);
				
	}
	
	
	public WebElement Email()
	{		
		//waitForElementDisplay();
		
		
		return Project.findElement(Username);		
	}	
	
	
	public WebElement Password()
	{
		return Project.findElement(Password);
	}
	
	public WebElement SignIn()
	{
		return Project.findElement(SignIn);
	}
	
	
	

}












