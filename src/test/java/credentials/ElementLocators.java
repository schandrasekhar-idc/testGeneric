package credentials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementLocators 
{
	
	protected WebDriver Project;
	protected WebDriverWait wait;
	
	protected By Username = By.xpath(".//*[@id='signIn']/fieldset/section[1]/div/div[2]/label/input");
	protected By Password = By.xpath(".//*[@id='signIn']/fieldset/section[2]/div/div/label/input");
	protected By SignIn = By.xpath(".//*[@id='signIn']/div[2]/footer/button");
	protected By Home = By.xpath(".//*[@id='menu-toggle']/i");  
	protected By HomeLink = By.xpath(".//*[@id=\"sidebar-wrapper\"]/ul/div/div/a[1]");
	protected By MyProfile = By.xpath(".//*[@id='page-wrapper']/div/div[2]/div/div/div[1]/a/div/div[1]/span");
	protected By Campaign = By.xpath(".//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/a/div/div[1]/span");
	protected By Users = By.xpath(".//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[3]/a/div/div[1]/span");
	protected By DataMining = By.xpath(".//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[4]/a/div/div[1]/span");
	protected By Analytics = By.xpath(".//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[5]/a/div/div[1]/span");
	protected By Partners = By.xpath(".//*[@id='page-wrapper']/div/div[2]/div/div/div[6]/a/div/div[1]/span");
	protected By URL = By.xpath(".//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[7]/a/div/div[1]/span");
	protected By CustomizeEmail = By.xpath(".//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[8]/a/div/div[1]/span");
	protected By CustomizeReport = By.xpath(".//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[9]/a/div/div[1]/span");
	protected By DomainBlacklist = By.xpath(".//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[10]/a/div/div[1]/span");
	protected By ManageTemplate = By.xpath(".//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[11]/a/div/div[1]/span");
	protected By Compliance = By.xpath(".//*[@id='table']/tbody/tr[2]/td[6]/a[8]");
	protected By Edit = By.xpath("//*[@id=\"table\"]/tbody/tr/td[6]/a[1]");
	protected By ToggleUser =By.xpath("//*[@title='Toggle']");
	protected By AddNewUser = By.linkText("Add New User");
	protected By AddUserEmail = By.xpath("//*[@id=\"addUser\"]/fieldset/div/section/div/div[3]/div[2]/label/input");
	protected By AddUserFirstName = By.xpath("//*[@id=\"addUser\"]/fieldset/div/section/div/div[4]/div[2]/label/input");
	protected By AddUserLastName = By.xpath("//*[@id=\"addUser\"]/fieldset/div/section/div/div[5]/div[2]/label/input");
	protected By AddUserOK = By.xpath("//*[@id=\"addUser\"]/div/div/div/div[2]/button");
	protected By AddUserClose = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[6]/div/div/div[3]/a");
	protected By AddUserModalSuccess = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[6]/div/div/div/h4");
	protected By AddUserModalCreatedSuccessMsg = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[6]/div/div/div[2]/ul");
	protected By SearchUser = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div[1]/div[1]/div[3]/input");
	protected By DeactivateUser = By.xpath("//*[@id=\"table\"]/tbody/tr/td[8]/a[2]");
	protected By DeactivateUserOk = By.xpath("//*[@id=\"deactivateUser\"]/div/div/div/div[2]/button");
	protected By DeactivateUserSuccessClose = By.xpath("//*[@id=\"successMessageDialog\"]/div/div/div[3]/a");
	protected By DeactivateUserDelete = By.xpath("//*[text()='Delete']");
	protected By DeleteUserNewOwnerDdown = By.xpath("//*[@id='deleteUser']/fieldset/div/section/div/div[8]/div/label/select");
	protected By DeleteUserNewOwnerOK = By.xpath("//*[@id=\"deleteUser\"]/div/div/div/div[2]/button");
	protected By DownloadDatamining = By.xpath("//*[@id=\"dataMining\"]/div/div[5]/div[2]/button");
	protected By DMDateRange = By.xpath("//*[@name=\"DateRange\"]");
	protected By DMDateRangeStart = By.xpath("//*[@name=\"daterangepicker_start\"]");
	protected By DMDateRangeEnd = By.xpath("//*[@name=\"daterangepicker_end\"]");
	protected By DMDateRangeStartCalendar = By.xpath("//*[@class=\"calendar second left\"]");
	protected By DMDateRangeEndCalendar = By.xpath("//*[@class=\"calendar first right\"]");
	protected By DMDateApply = By.xpath("//*[@class=\"applyBtn btn btn-small btn-sm btn-success\"]");
	
	public ElementLocators(WebDriver Project)
	{
		this.Project = Project;		
	}
	

	public void waitAndVerifyTitle()
	{
		wait = new WebDriverWait(Project, 30);
		wait.until(ExpectedConditions.titleIs("OpenShift on AWS"));
		
		System.out.println(" Page Title is: OpenShift on AWS" );
	}
	
	
	

}
