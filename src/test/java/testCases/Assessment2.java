//package testCases;

//public class Assessment {

//}

//====================

package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assessment2 {

	// @SuppressWarnings("unlikely-arg-type")
	@Test
	public static void Assessment() throws IOException, InterruptedException

	{

		// ==========================================================================================================================================//
		// System.setProperty("webdriver.chrome.driver","C://Users//akaur//Desktop//My
		// IDC//Automation
		// Scripts//Softwares//selenium-java-3.141.59//chromedriver_win32//chromedriver.exe");//System.setProperty("webdriver.chrome.driver",
		// "C:\\sarath_eclipse\\sarath_eclipse_jars\\EdgeDriver\\MicrosoftWebDriver.exe");
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver Project = new ChromeDriver();
		
		Project.manage().window().maximize();
		Project.get("https://dev-aws-openshift-bvss-20.webappuat.com/");
		Project.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String titlecs = Project.getTitle();
		System.out.println("Text from dev site: TOOL NAME: " + titlecs);

		//==========================================================================================================================================//
		 
		//fileInputStream argument
					//FileInputStream fis = new FileInputStream("C://Users//schandrasekhar//Desktop//DataDrivenTestFile.xlsx");
					
		FileInputStream fis = new FileInputStream(
				"C://Users//schandrasekhar//Desktop//IDC//Projects//Automation//DDF.xlsx");
		
		@SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
					
					XSSFSheet sheet = workbook.getSheetAt(0);
					Row rowcs= sheet.getRow(0);
					Cell cellcs=rowcs.getCell(0);
					System.out.println(cellcs);
			
}
	
}

