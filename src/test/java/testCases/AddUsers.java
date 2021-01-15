package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import credentials.ElementLocators;
import objectRepository.LoginPage;
import objectRepository.HomePage;
import objectRepository.MyProfilePage;
import objectRepository.UsersPage;

public class AddUsers 
{
	
	
		
	@Test
	public void TC_AddUsers() throws InterruptedException, IOException
	{
		
		//======================================================================================================
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver Project = new ChromeDriver();
		
		
		//maximize browser
		Project.manage().window().maximize();
		Project.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Project.get("https://dev-aws-openshift-bvss-20.webappuat.com/home/signin");
		
		//verify page title
		//waitForElementDisplay()
		ElementLocators EL = new ElementLocators(Project);
		EL.waitAndVerifyTitle();
		
		//access objectRepository package classes
		LoginPage LP = new LoginPage(Project);
		
				
		//access Email() and give Username value
		LP.Email().sendKeys("idc.test.adm@webappuat.com");
		
		
		
		//Thread.sleep(20000);
		//access Password() and give Password value
		LP.Password().sendKeys("Test1234!");
		
		//access SignIn() and click SignIn button
		LP.SignIn().click();
		
		//=====================================================================================================================
		
		//access objectRepository class - HomePage
		HomePage HP = new HomePage(Project);
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//click on Menu-Toggle
		HP.Home().click();
		
				
		//=====================================================================================================================
		
		//Users
		//access objectRepository class - MyProfile
		UsersPage AU = new UsersPage(Project);
		
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//Add new user in Users module
		AU.AddUsers();
		
		//======================================================================================================================
		
				
				
		
	}
	
	

}
