//package testCases;

//public class Assessment {

//}

//====================

package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class Assessment {

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

		// ==========================================================================================================================================//

		// fileInputStream argument
		FileInputStream fis = new FileInputStream(
				"C://Users//schandrasekhar//Desktop//IDC//Projects//Automation//DDF.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// EXCEL SHEET 1
		//List<XSSFName> Namecol=workbook.getAllNames();
		
	XSSFSheet sheet = workbook.getSheetAt(0);
		//NameCollection sheet = workbook.getAllNames()
		
		//System.out.println(workbook.getAllNames());
		
		//System.out.println(Namecol);
		
	
	//================
	
	/*
	String dataDir = Utils.getSharedDataDir(AccessAllNamedRanges.class) + "data/";

	// Instantiating a Workbook object
	Workbook workbook = new Workbook(dataDir + "book1.xls");

	WorksheetCollection worksheets = workbook.getWorksheets();

	// Accessing the first worksheet in the Excel file
	Worksheet sheet = worksheets.get(0);
	Cells cells = sheet.getCells();

	// Getting all named ranges
	Range[] namedRanges = worksheets.getNamedRanges();

	// Print message
	System.out.println("Number of Named Ranges : " + namedRanges.length);
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//=============
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Judge whether a worksheet is hidden
		
		/*
		     foreach (Worksheet sheet in workbook.Worksheets)
		
		     {
		
		         if (sheet.Visibility == WorksheetVisibility.Hidden)
		
		         {
		
		             returnVal.Add(sheet);
		
		         }
		
		     }
		     
		     */
		
		
		
		
		
		
		/*
		
		//Workbook wb = WorkbookFactory.create("input.xlsx");
		int sheetIndex = 0;
		XSSFSheet s = workbook.getSheetAt(sheetIndex);
		Cell wanted = s.getRow(0).getCell(0);
		//String wantedRef = (new CellReference(wanted)).formatAsString();

		// Check all the named range
		for (int nn=0; nn<workbook.getNumberOfNames(); nn++) {
		   Name n = wb.getNameAt(nn);
		   if (n.getSheetIndex() == -1 || n.getSheetIndex() == sheetIndex) {
		      //if (n.getRefersToFormula().equals(wantedRef)) {
		         // Found it!
		         return name.getNameName();
		      }
		   }
		}
		
		*/
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Row rowcs = sheet.getRow(0);
//		System.out.println("EXCEL ROW" + rowcs);
		Cell cellcs = rowcs.getCell(0); // 1st row, 1 column
		System.out.println("EXCEL COL:" + cellcs);
		
		
		
		/*
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
                   	System.out.println(cell);
		System.out.println(sheet.getRow(0).getCell(0));
		*/
		
		
		
		
		
		
		
		
		
		
		
		//Cell cellcs = rowcs.getCell(11);//Questionnaire G12
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// EXCEL SHEET 2
	XSSFSheet sheet1 = workbook.getSheetAt(1);
		Cell cell_S2 = rowcs.getCell(0);
		String RibbonTxt = Project.findElement(By.xpath("//*[@id=\"warning\"]/div/div/div[2]/h3")).getText();
		System.out.println("SITE INFO:" + RibbonTxt);

		cell_S2 = sheet1.getRow(1).getCell(0);
		DataFormatter dataFormatter = new DataFormatter();
		String value = dataFormatter.formatCellValue(cell_S2);
		int empSize = Integer.parseInt(value);
		System.out.println("cell value is - " + empSize);

		// ===========================

		// LANDING PAGE TEXT
		String LPageText = "";
		String[] LPage1Array = new String[3];
		rowcs = sheet.getRow(1);
		cellcs = rowcs.getCell(0);
		// System.out.println("LANDING PAGE INFO :" + cellcs);
		String[] LPgaeExcelAry = new String[3];
		LPageText = Project.findElement(By.xpath("//*[@id=\"landing\"]/div/div/div[1]/h1")).getText();
		LPgaeExcelAry[0] = sheet.getRow(1).getCell(0).getStringCellValue();
		if (LPageText.equals(LPgaeExcelAry[0])) {
			System.out.println("LANDING PAGE - Text matched " + LPageText);
		} else {

			System.out.println("Keep trying loser");
		}

		for (int i = 1; i <= 2; i++) {
			System.out.println("FOR LOOP - LPage " + i);
			//// *[@id="landing"]/div/div/div[1]/h2[1]
			LPageText = Project.findElement(By.xpath("//*[@id=\"landing\"]/div/div/div[1]/h2[" + i + "]")).getText();
			// System.out.println("Text from dev site: "+LPageText);
			LPage1Array[i] = LPageText;
			System.out.println("LPage1Array [" + (i) + "] " + LPage1Array[i]);
			LPgaeExcelAry[i] = sheet.getRow(i + 1).getCell(0).getStringCellValue();
			System.out.println("LPgaeExcelAry [" + (i) + "] " + LPgaeExcelAry[i]);
			if (LPage1Array[i].equals(LPgaeExcelAry[i])) {
				System.out.println("LANDING PAGE - Text matched ");

			} else {

				System.out.println("Keep trying loser");
			}
		}

		// ====================================Landing
		// Page===========================================================================================//

		// Close - Dev Site pop-up modal
		Thread.sleep(2000);
		Project.findElement(By.xpath("//div[@id='warning']/div/div/div[3]/a")).click();

		// AGREE AND CONTINUE - Cookie
		Thread.sleep(2000);
		Project.findElement(By.xpath("//div[@class='cookie-section']/div/div/div[2]/p/a[2]")).click();

		// ==========================================================================================================================================//

		Thread.sleep(2000);
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

		// ==========================================================================================================================================//

		// Questionnaire page 1 text
		String Page1Text = "";
		String[] Page1Array = new String[5];
		rowcs = sheet.getRow(9);
		cellcs = rowcs.getCell(0);
		// System.out.println("Text from framework: "+cellcs);
		String[] Page1ExcelAry = new String[5];
		for (int i = 3; i <= 7; i++) {
			System.out.println("FOR LOOP " + i);
			Page1Text = Project
					.findElement(
							By.xpath("//*[@id=\"sectionForm1\"]/div/section/fieldset/div[1]/div/div[" + i + "]/div[1]"))
					.getText();
			// System.out.println("PAGE1 Text : "+P1headingText);

			Page1Array[i - 3] = Page1Text;
			System.out.println("Page1Array [" + (i - 3) + "] " + Page1Array[i - 3]);

			Page1ExcelAry[i - 3] = sheet.getRow(i + 7).getCell(0).getStringCellValue();
			System.out.println("Page1ExcelAry[" + (i - 3) + "] " + Page1ExcelAry[i - 3]);
			if (Page1Array[i - 3].equals(Page1ExcelAry[i - 3])) {
				System.out.println("PAGE 1 OPTION - Text matched ");
				if (i == 3)
				{
					System.out.println("------- i=3 -------  ");
					if (Page1Array[i - 3].length() != 0) {

						System.out.println("Element is Present  " + Page1Array[i - 3]);
						// System.out.println("Element is Present "+Page1Array[i-3]);
						// INPUT FROM SHEET2 IN EXCEL

						// Number of employees using business applications at your organization - Today

						Project.findElement(By.xpath("//*[@id=\"Q1-QI1-AC1\"]")).sendKeys(empSize + "");

						// Tab out to prefill other fields on the Assessment Page-1
						Project.findElement(By.xpath("//*[@id=\"Q1-QI1-AC1\"]")).sendKeys(Keys.TAB);
					} else {
						System.out.println("Element is Absent ");
					}
				} else {
					System.out.println("Keep trying loser");

				}
			}

		}
		/*
		 * // Number of employees using business applications at your organization -
		 * Today
		 * Project.findElement(By.xpath("//*[@id=\"Q1-QI1-AC1\"]")).sendKeys("100");
		 * 
		 * // Tab out to prefill other fields on the Assessment Page-1
		 * Project.findElement(By.xpath("//*[@id=\"Q1-QI1-AC1\"]")).sendKeys(Keys.TAB);
		 */
		int NextBtnSize = Project
				.findElements(By.xpath("//form[@id='sectionForm1']/div/section/div/div/button[@id='btnNext']")).size();
		System.out.println("Number of Next button(s) present :  " + BeginAssessmentBtnSize);

		// click Next button
		Project.findElement(By.xpath("//form[@id='sectionForm1']/div/section/div/div/button[@id='btnNext']")).click();
		System.out.println("On Assessment Page-1, Next button is clicked");

		System.out.println("*****  PAGE1 IS DONE  ******");

		Thread.sleep(2000);
		// ==========================================================================================================================================//
		// Questionnaire page 2 text

		rowcs = sheet.getRow(15);
		cellcs = rowcs.getCell(0);
		System.out.println("******  PAGE 2 ******: " + cellcs);
		String Page2Text = Project
				.findElement(By.xpath("//*[@id=\"sectionForm2\"]/div/section/fieldset/div/div/div[1]/div/div[2]/label"))
				.getText();
		System.out.println("LABEL " + Page2Text);
		String P2headingExl2 = sheet.getRow(15).getCell(0).getStringCellValue();

		if (Page2Text.equals(P2headingExl2)) {
			System.out.println(" Label matched " + Page2Text);
		} else {
			System.out.println("Keep trying loser" + Page2Text);
		}

		String[] Page2Array = new String[5];
		rowcs = sheet.getRow(16);
		cellcs = rowcs.getCell(0);
		System.out.println("TEXT FROM EXCEL FILE PAGE 2 : " + cellcs);
		String[] Page2ExcelAry = new String[5];
		for (int i = 1; i <= 4; i++) {
			System.out.println("FOR LOOP " + i);
			Page2Text = Project
					.findElement(By.xpath(
							"//*[@id=\"sectionForm2\"]/div/section/fieldset/div/div/div[3]/div[" + i + "]/div[1]"))
					.getText();
			System.out.println("PAGE2 Text from Tool : " + Page2Text);
			Page2Array[i] = Page2Text;
			System.out.println("Page2Array [" + i + "] " + Page2Array[i]);
			Page2ExcelAry[i] = sheet.getRow(i + 15).getCell(0).getStringCellValue();
			System.out.println("Page2ExcelAry[" + i + "] " + Page2ExcelAry[i]);
			if (Page2Array[i].equals(Page2ExcelAry[i])) {
				System.out.println("PAGE 2 - Text matched ");

			} else {

				System.out.println("Keep trying loser");
			}
		}

		// Number of buttons present on assessment page 2
		int NextBtnSize2 = Project
				.findElements(By.xpath("//form[@id='sectionForm2']/div/section/div/div/button[@id='btnNext']")).size();
		System.out.println("Next button size on Assessment Page-2, is:  " + NextBtnSize2);

		// click Next button
		Project.findElement(By.xpath("//form[@id='sectionForm2']/div/section/div/div/button[@id='btnNext']")).click();
		System.out.println("On Assessment Page-2, Next button is clicked");

		System.out.println("*****  PAGE2 IS DONE  ******");

		Thread.sleep(2000);
		// ==========================================================================================================================================//
		// Questionnaire page 3 text

		rowcs = sheet.getRow(20);
		cellcs = rowcs.getCell(0);
		System.out.println("******  PAGE 3 ******: " + cellcs);//// *[@id="sectionForm3"]/div/section/fieldset[1]/div/div/div[1]/div/div[2]/label
		String Page3Text = Project
				.findElement(
						By.xpath("//*[@id=\"sectionForm3\"]/div/section/fieldset[1]/div/div/div[1]/div/div[2]/label"))
				.getText();
		System.out.println("LABEL " + Page3Text);
		String P3headingExl2 = sheet.getRow(20).getCell(0).getStringCellValue();

		if (Page3Text.equals(P3headingExl2)) {
			System.out.println(" Label matched " + Page3Text);
		} else {
			System.out.println("Keep trying loser" + Page3Text);
		}

		String[] Page3Array = new String[5];
		rowcs = sheet.getRow(21);
		cellcs = rowcs.getCell(0);
		System.out.println("TEXT FROM EXCEL FILE PAGE 3 : " + cellcs);
		String[] Page3ExcelAry = new String[5];
		for (int i = 1; i <= 3; i++) {
			System.out.println("FOR LOOP " + i); //// *[@id="sectionForm3"]/div/section/fieldset[1]/div/div/div[3]/div[1]/div[1]
			Page3Text = Project
					.findElement(By.xpath(
							"//*[@id=\"sectionForm3\"]/div/section/fieldset[1]/div/div/div[3]/div[" + i + "]/div[1]"))
					.getText();
			System.out.println("PAGE3 Text from Tool : " + Page3Text);
			Page3Array[i] = Page3Text;
			System.out.println("Page3Array [" + i + "] " + Page3Array[i]);
			Page3ExcelAry[i] = sheet.getRow(i + 20).getCell(0).getStringCellValue();
			System.out.println("Page3ExcelAry[" + i + "] " + Page3ExcelAry[i]);
			if (Page3Array[i].equals(Page3ExcelAry[i])) {
				System.out.println("PAGE 3 - Text matched ");

			} else {

				System.out.println("Keep trying loser");
			}
		}

		/*
		 * SUBSECTION - PAGE 3
		 */
		String Page3SubSectionText = Project
				.findElement(
						By.xpath("//*[@id=\"sectionForm3\"]/div/section/fieldset[2]/div/div/div[1]/div/div[2]/label"))
				.getText();
		System.out.println("LABEL SUBSECTION " + Page3SubSectionText);
		String P3SubSectionExl2 = sheet.getRow(24).getCell(0).getStringCellValue();

		if (Page3SubSectionText.equals(P3SubSectionExl2)) {
			System.out.println(" SubSection matched " + Page3SubSectionText);
		} else {
			System.out.println("Keep trying loser  " + Page3SubSectionText);
		}
		/*
		 * SUBSECTION - PAGE 3 (2)
		 */

		Page3SubSectionText = Project
				.findElement(By.xpath("//*[@id=\"sectionForm3\"]/div/section/fieldset[2]/div/div/div[3]/div/div[1]"))
				.getText();
		System.out.println("OPTION 2 SUBSECTION " + Page3SubSectionText);
		P3SubSectionExl2 = sheet.getRow(25).getCell(0).getStringCellValue();

		if (Page3SubSectionText.equals(P3SubSectionExl2)) {
			System.out.println(" SubSection OPTION matched " + Page3SubSectionText);
		} else {
			System.out.println("Keep trying loser  " + Page3SubSectionText);
		}

		// Number of buttons present on assessment page 3
		int NextBtnSize3 = Project
				.findElements(By.xpath("//form[@id='sectionForm3']/div/section/div/div/button[@id='btnNext']")).size();
		System.out.println("Next button size on Assessment Page-3, is:  " + NextBtnSize3);

		// click Next button
		Project.findElement(By.xpath("//form[@id='sectionForm3']/div/section/div/div/button[@id='btnNext']")).click();
		System.out.println("On Assessment Page-3, Next button is clicked");

		System.out.println("*****  PAGE3 IS DONE  ******");

		// Questionnaire page 4 text
		// //*[@id="sectionForm4"]/div/section/fieldset[1]/div[1]/div/blockquote/h3
		// WebElement
		// Try=Project.findElement(By.xpath("//*[@id=\"sectionForm4\"]/div/section/fieldset[1]/div[1]/div/blockquote/h3"));
		// driver.findElement(By.className("addItem")).click();
		//#sectionForm4 > div > section > fieldset:nth-child(1) > div:nth-child(1) > div > blockquote > h3
		/*WebElement PFOURheadingText = Project
				.findElement(By.cssSelector("#sectionForm4 > div > section > fieldset:nth-child(1) > div:nth-child(1) > div > blockquote > h3"));

		System.out.println("PAGE 4 ELEMENTS:- " + PFOURheadingText.getText());
		Project.close();
		*//*
		 * String P4headingExl2 = sheet.getRow(29).getCell(0).getStringCellValue();
		 * 
		 * 
		 * if(P4headingText.contains(P4headingExl2)) {
		 * System.out.println(" Label matched "+P4headingText); } else {
		 * System.out.println("Keep trying loser"+P4headingText); }
		 */
		// Verify if Industry dropdown is present on the web page
		if (Project.findElements(By.xpath(
				"//form[@id='sectionForm4']/div/section/fieldset[1]/div[2]/div/div[2]//ul[@class='dropdown-content select-dropdown w-100 ']"))
				.size() != 0) {
			System.out.println("Industry dropdown is Present");
		} else {
			System.out.println("Industry dropdown is Absent");
		}

		// Select Industry
		WebElement Industry = Project.findElement(By.cssSelector(
				"#sectionForm4 > div > section > fieldset:nth-child(1) > div:nth-child(2) > div > div.select-wrapper.selectBox.mdb-select.scrollable-menu > input"));

		Industry.click();
		System.out.println("Industry clicked");
		Industry.findElement(
				By.xpath("//form[@id='sectionForm4']/div/section/fieldset[1]/div[2]/div/div[2]/ul/li[4]/span")).click();
		System.out.println("Banking industry selected");

		// Select IndustryClick = new Select(Industry);
		// IndustryClick.selectByValue("18");

		// Select Country
		Thread.sleep(2000);

		WebElement Country = Project.findElement(By.cssSelector(
				"#sectionForm4 > div > section > fieldset:nth-child(2) > div > div > div:nth-child(2) > input"));
		Country.click();
		System.out.println("Country clicked");

		Country.findElement(By.xpath("//form[@id='sectionForm4']/div/section/fieldset[2]/div/div/div[2]/ul/li[20]"))
				.click();
		System.out.println("Country selected");

		// Click Next button
		Thread.sleep(2000);

		Project.findElement(By.xpath("//form[@id='sectionForm4']/div/section/div/div/button[@id='btnNext']")).click();
		System.out.println("On Assessment Page-4, Next button is clicked");

		// ****************************************Registration Page***************************************************//
		// Find and Enter a value in First Name web element

		Project.findElement(By.xpath("//*[@id='Q6-QI16-AC293']")).sendKeys("Test FirstName");

		Project.findElement(By.xpath("//*[@id='Q7-QI17-AC294']")).sendKeys("Test LastName");

		Project.findElement(By.xpath("//*[@id='Q8-QI18-AC295']")).sendKeys("Test OrgtName");

		Project.findElement(By.xpath("//*[@id='Q9-QI19-AC296']")).sendKeys("idc.test.adm@webappuat.com");

		Project.findElement(By.xpath("//*[@id='Q10-QI20-AC297']")).sendKeys("Test JobTitle");

		Project.findElement(By.xpath("//*[@id='callThankyou']")).click();

		System.out.println("*****  PAGE4 IS DONE  ******");
		Thread.sleep(20000);
		Project.close();

	}

}

