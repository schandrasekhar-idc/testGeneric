package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import credentials.ElementLocators;
import objectRepository.LoginPage;
import objectRepository.ManageTemplatePage;
import objectRepository.AnalyticsPage;
import objectRepository.CampaignPage;
import objectRepository.CustomizeEmailPage;
import objectRepository.CustomizeReportPage;
import objectRepository.DataMiningPage;
import objectRepository.DomainBlacklistPage;
import objectRepository.HomePage;
import objectRepository.MyProfilePage;
import objectRepository.PartnersPage;
import objectRepository.URLPage;
import objectRepository.UsersPage;

public class TC_AdminConsole 
{
	
	
		
	@Test
	public void TC_AdminConsole() throws InterruptedException
	{
		
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
		
		//My Profile - Test
		//access objectRepository class - MyProfile
		MyProfilePage MP = new MyProfilePage(Project);
		
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//click on MyProfile module
		MP.MyProfile().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//Return to Console using Menu-Toggle
		HP.Home().click();
		
		//click on Home link
		HP.HomeLink().click();
		
		
		//======================================================================================================================
		
		//Campaign - Test
		//access objectRepository class - CampaignPage
		CampaignPage MC = new CampaignPage(Project);
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//click on Campaign module
		MC.Campaign().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//Return to Console using Menu-Toggle
		HP.Home().click();
				
		//click on Home link
		HP.HomeLink().click();
				
				
		//======================================================================================================================
		
		//Users - Test
		//access objectRepository class - UsersPage
		UsersPage U = new UsersPage(Project);
				
		//wait 20 seconds
		Thread.sleep(20000);
				
		//click on Users module
		U.AccessUsersModule().click();
		
		
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
						
		//Return to Console using Menu-Toggle
		HP.Home().click();
						
		//click on Home link
		HP.HomeLink().click();
						
						
		//======================================================================================================================
				
		//Data Mining - Test
		//access objectRepository class - DataMiningPage
		DataMiningPage DM = new DataMiningPage(Project);
						
		//wait 20 seconds
		Thread.sleep(20000);
						
		//click on DataMining module
		DM.DataMining().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
								
		//Return to Console using Menu-Toggle
		HP.Home().click();
								
		//click on Home link
		HP.HomeLink().click();
								
								
		//======================================================================================================================
						
		//Analytics - Test
		//access objectRepository class - AnalyticsPage
		AnalyticsPage AN = new AnalyticsPage(Project);
								
		//wait 20 seconds
		Thread.sleep(20000);
								
		//click on Analytics module
		AN.Analytics().click();
		
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
										
		//Return to Console using Menu-Toggle
		HP.Home().click();
										
		//click on Home link
		HP.HomeLink().click();
										
										
		//======================================================================================================================
								
		//Partners - Test
		//access objectRepository class - AnalyticsPage
		PartnersPage P = new PartnersPage(Project);
										
		//wait 20 seconds
		Thread.sleep(20000);
										
		//click on Analytics module
		P.Partners().click();
				
				
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
										
		//Return to Console using Menu-Toggle
		HP.Home().click();
										
		//click on Home link
		HP.HomeLink().click();
										
										
		//======================================================================================================================
								
		//URL - Test
		//access objectRepository class - AnalyticsPage
		URLPage URL = new URLPage(Project);
										
		//wait 20 seconds
		Thread.sleep(20000);
										
		//click on URL module
		URL.URL().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
												
		//Return to Console using Menu-Toggle
		HP.Home().click();
												
		//click on Home link
		HP.HomeLink().click();
												
												
		//======================================================================================================================
										
		//Customize Email - Test
		//access objectRepository class - CustomizeEmailPage
		CustomizeEmailPage CE = new CustomizeEmailPage(Project);
												
		//wait 20 seconds
		Thread.sleep(20000);
												
		//click on Analytics module
		CE.CustomizeEmail().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
														
		//Return to Console using Menu-Toggle
		HP.Home().click();
														
		//click on Home link
		HP.HomeLink().click();
														
														
		//======================================================================================================================
												
		//Customize Report - Test
		//access objectRepository class - CustomizeReportPage
		CustomizeReportPage CR = new CustomizeReportPage(Project);
														
		//wait 20 seconds
		Thread.sleep(20000);
														
		//click on CustomizeReport module
		CR.CustomizeReport().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
																
		//Return to Console using Menu-Toggle
		HP.Home().click();
																
		//click on Home link
		HP.HomeLink().click();
																
																
		//======================================================================================================================
														
		//Domain Blacklist - Test
		//access objectRepository class - DomainBlacklistPage
		DomainBlacklistPage DB = new DomainBlacklistPage(Project);
																
		//wait 20 seconds
		Thread.sleep(20000);
																
		//click on Domain Blacklist module
		DB.DomainBlacklist().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
																		
		//Return to Console using Menu-Toggle
		HP.Home().click();
																		
		//click on Home link
		HP.HomeLink().click();
																		
																		
		//======================================================================================================================
																
		//Manage Template - Test
		//access objectRepository class - ManageTemplate
		ManageTemplatePage MT = new ManageTemplatePage(Project);
																		
		//wait 20 seconds
		Thread.sleep(20000);
																		
		//click on ManageTemplate module
		MT.ManageTemplate().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
												
		//Return to Console using Menu-Toggle
		HP.Home().click();
												
		//click on Home link
		HP.HomeLink().click();
												
												
		//======================================================================================================================
		
		
	}
	
	

}
