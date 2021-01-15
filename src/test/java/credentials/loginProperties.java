package credentials;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class loginProperties 
{
	protected WebDriver Project;
	protected Properties loginproperties;
	
	protected final String filePath = "configs//Configuration.properties";
	
	
	
	public loginProperties(WebDriver Project)
	{
		this.Project = Project;		
	}
	
	public String usernameValue(int a, int b, int c)
	{
		String Username="idc.test.adm@webappuat.com";
		String Password="Test1234!";		
		
		String NewUserEmail="idcqatest1@webappuat.com";
		String NewUserFirstName="IDC Test1";		
		String NewUserLastName="Admin1";
		
		String DelUserEmail="idcqatest2@webappuat.com";
		String DelUserFirstName="IDC Test2";		
		String DelUserLastName="Admin2";
		
		
		if(a==1)
		{			
			return NewUserEmail;			
		}
		if(a==2)
		{			
			return DelUserEmail;			
		}
		if(b==2)
		{			
			return NewUserFirstName;
		}
		if(b==3)
		{			
			return DelUserFirstName;
		}
		if(c==3)
		{			
			return NewUserLastName;
		}
		if(c==4)
		{			
			return DelUserLastName;
		}
		return Password;
		
				
		
	}
	
	
	
}
