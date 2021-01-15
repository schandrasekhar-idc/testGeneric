package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import credentials.ElementLocators;
import objectRepository.LoginPage;
import objectRepository.HomePage;
import objectRepository.MyProfilePage;
import objectRepository.UsersPage;

public class GmailLogin 
{
	
	
		
	@Test
	public void GmailAccess() throws InterruptedException, IOException
	{
		
		//======================================================================================================
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver Project = new ChromeDriver();
		
		
		//maximize browser
		Project.manage().window().maximize();
		Project.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//WebElement GSignIn=Project.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	//GSignIn.sendKeys("idcqatest1@gmail.com");
		
		WebElement gm = Project.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		WebElement gmNext = Project.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
		gm.sendKeys("idcqatest1@gmail.com");
		gmNext.click();
		
		
		
		
	}

}
