package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.LoginPage;
import objectRepository.HomePage;
import objectRepository.PartnersPage;

public class ApplicationPartners 
{
	
	
		
	@Test
	public void TC_MyProfile() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver Project = new ChromeDriver();
		
		
		//maximize browser
		Project.manage().window().maximize();
		
		Project.get("https://uat-cisco-mca-tool-2018.webappuat.com/home/signin");
		
		
		//access objectRepository package classes
		LoginPage LP = new LoginPage(Project);
		
		//wait statement and
		//constructor for ElementLocators
			
		
		//access Email() and give Username value
		LP.Email().sendKeys("schandrasekhar@idc.com");
		
	 	
		
		Thread.sleep(20000);
		//access Password() and give Password value
		LP.Password().sendKeys("Test1234!");
		
		//access SignIn() and click SignIn button
		LP.SignIn().click();
		
		//=====================================================================================================================
		
		//access objectRepository class - HomePage
		HomePage HP = new HomePage(Project);
		
		//wait 20 seconds
		Thread.sleep(16000);
		
		//click on Home link
		HP.Home().click();
		
				
		//=====================================================================================================================
		
		//access objectRepository class - PartnersPage
		PartnersPage Part = new PartnersPage(Project);
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//click on Partners
		Part.Partners().click();
		
		//wait  10 mseconds
		Thread.sleep(10000); //time in milliseconds
		
		//click on Compliance
		//Part.ProjectCompliance().click();
		
		//click on Edit
		Part.ProjectEdit().click();
		
		
		
		
		
		
		
		
		
	}
	
		

}
