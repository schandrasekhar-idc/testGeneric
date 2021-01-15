package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_Assessment 
{

	
		
		@Test
		public static void assessment() throws InterruptedException//main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\sarath_eclipse\\sarath_eclipse_jars\\EdgeDriver\\MicrosoftWebDriver.exe");
			
			WebDriver Project = new ChromeDriver();
			// Project.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			Project.manage().window().maximize();
			Project.get("https://dev-Projectroi.webappuat.com/");
			Project.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// *********************************************Landing Page*************************************************//

			// Close - Dev Site pop-up modal
			Thread.sleep(2000);
			Project.findElement(By.xpath("//div[@id='warning']/div/div/div[3]/a")).click();

			// AGREE AND CONTINUE - Cookie
			Thread.sleep(2000);
			Project.findElement(By.xpath("//div[@class='cookie-section']/div/div/div[2]/p/a[2]")).click();

			// Verify if Begin Assessment button is present
			if (Project.findElements(By.xpath("/html/body/div/div[2]/div/div/div/a")).size() != 0) {
				System.out.println("Element is Present");
			} else {
				System.out.println("Element is Absent");
			}

			// Find number of buttons present on Landing Page
			int BeginAssessmentBtnSize = Project.findElements(By.xpath("/html/body/div/div[2]/div/div/div/a")).size();
			System.out.println("Number of begin button(s) present :  " + BeginAssessmentBtnSize);

			// Click - Begin Assessment
			Project.findElement(By.xpath("//div[@id=\"landing\"]/div/div/div/a")).click();
			// Project.findElement(By.xpath("/html/body/div/div[2]/div/div/div/a")).click();
			System.out.println("Begin Assessment button is clicked");

			// ****************************************AssessmentPage-1***************************************************//

			// Number of employees using business applications at your organization - Today
			Project.findElement(By.xpath("//*[@id=\"Q1-QI1-AC1\"]")).sendKeys("5000");

			// Tab out to prefill other fields on the Assessment Page-1
			Project.findElement(By.xpath("//*[@id=\"Q1-QI1-AC1\"]")).sendKeys(Keys.TAB);

			// Verify if Next button is present
			if (Project.findElements(By.xpath("//form[@id='sectionForm1']/div/section/div/div/button[@id='btnNext']"))
					.size() != 0) {
				System.out.println("Element is Present");
			} else {
				System.out.println("Element is Absent");
			}

			// Find number of buttons present on Landing Page
			int NextBtnSize = Project
					.findElements(By.xpath("//form[@id='sectionForm1']/div/section/div/div/button[@id='btnNext']")).size();
			System.out.println("Number of Next button(s) present :  " + BeginAssessmentBtnSize);

			// click Next button
			Project.findElement(By.xpath("//form[@id='sectionForm1']/div/section/div/div/button[@id='btnNext']")).click();
			System.out.println("On Assessment Page-1, Next button is clicked");
			

			// ****************************************Assessment Page-2***************************************************//

			
			// Find and verify Next button on page-2 of assessment
			if (Project.findElements(By.xpath("//form[@id='sectionForm2']/div/section/div/div/button[@id='btnNext']"))
					.size() != 0) {
				System.out.println("Element is Present");
			}

			else {
				System.out.println("Element is Absent");
			}

			// Number of buttons present on assessment page 2
			int NextBtnSize2 = Project
					.findElements(By.xpath("//form[@id='sectionForm2']/div/section/div/div/button[@id='btnNext']")).size();
			System.out.println("Next button size on Assessment Page-2, is:  " + NextBtnSize2);

			Thread.sleep(10000);
			// click Next button
			Project.findElement(By.xpath("//form[@id='sectionForm2']/div/section/div/div/button[@id='btnNext']")).click();
			System.out.println("On Assessment Page-2, Next button is clicked");

			
			// ****************************************Assessment Page-3***************************************************//

			
			if (Project.findElements(By.xpath("//form[@id='sectionForm3']/div/section/div/div/button[@id='btnNext']"))
					.size() != 0) {
				System.out.println("Element is Present");
			}

			else {
				System.out.println("Element is Absent");
			}

			// Number of buttons present on assessment page 3
			int NextBtnSize3 = Project
					.findElements(By.xpath("//form[@id='sectionForm3']/div/section/div/div/button[@id='btnNext']")).size();
			System.out.println("Next button size on Assessment Page-3, is:  " + NextBtnSize3);
			Thread.sleep(10000);
			// click Next button
			Project.findElement(By.xpath("//form[@id='sectionForm3']/div/section/div/div/button[@id='btnNext']")).click();
			System.out.println("On Assessment Page-3, Next button is clicked");
			

			// ****************************************Assessment Page-4***************************************************//
			
			//Verify if Industry dropdown is present on the web page
			if (Project.findElements(By.xpath(
					"//form[@id='sectionForm4']/div/section/fieldset[1]/div[2]/div/div[2]//ul[@class='dropdown-content select-dropdown w-100 ']"))
					.size() != 0) {
				System.out.println("Industry dropdown is Present");
			} else {
				System.out.println("Industry dropdown is Absent");
			}

			Thread.sleep(10000);
			// Select Industry
			  WebElement Industry = Project.findElement(By.cssSelector(
			  "#sectionForm4 > div > section > fieldset:nth-child(1) > div:nth-child(2) > div > div.select-wrapper.selectBox.mdb-select.scrollable-menu > input"));
			  
			Industry.click();
			System.out.println("Industry clicked");
			
			Thread.sleep(10000);
			Industry.findElement(By.xpath("//form[@id='sectionForm4']/div/section/fieldset[1]/div[2]/div/div[2]/ul/li[4]/span")).click();
			System.out.println("Banking industry selected");

			// Select IndustryClick = new Select(Industry);
			// IndustryClick.selectByValue("18");

			//Select Country
			Thread.sleep(10000);
			
			  WebElement Country = Project.findElement(By.cssSelector(
					  "#sectionForm4 > div > section > fieldset:nth-child(2) > div > div > div:nth-child(2) > input"));
					  Country.click();
			  System.out.println("Country clicked");
			  Thread.sleep(10000);
			  Country.findElement(By.xpath("//form[@id='sectionForm4']/div/section/fieldset[2]/div/div/div[2]/ul/li[2]")).click();
			  System.out.println("Country selected");
			  
			  //Click Next button
			  Thread.sleep(2000);
				
			  Project.findElement(By.xpath("//form[@id='sectionForm4']/div/section/div/div/button[@id='btnNext']")).click();
				System.out.println("On Assessment Page-4, Next button is clicked");

			// ****************************************Registration Page***************************************************//
				//Find and Enter a value in First Name web element
				
				Project.findElement(By.xpath("//*[@id='Q6-QI16-AC293']")).sendKeys("Test First name");
				
				Project.findElement(By.xpath("//*[@id='Q7-QI17-AC294']")).sendKeys("Test Last name");
				
				
				Project.findElement(By.xpath("//*[@id='Q8-QI18-AC295']")).sendKeys("IDC Test Assessment");
				
				
				Project.findElement(By.xpath("//*[@id='Q9-QI19-AC296']")).sendKeys("idc.test.adm@webappuat.com");
				
				
				Project.findElement(By.xpath("//*[@id='Q10-QI20-AC297']")).sendKeys("Test Job title");
				
				Project.findElement(By.xpath("//*[@id='callThankyou']")).click();

				}

	}
