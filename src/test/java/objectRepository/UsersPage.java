package objectRepository;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import credentials.ElementLocators;
import credentials.loginProperties;

public class UsersPage extends ElementLocators
{	
	
	
	//constructor
	public UsersPage(WebDriver Project)
	{
		super(Project);
		
	}
	
	public WebElement Home()
	{
		return Project.findElement(Home);
	}
	
	public WebElement AccessUsersModule()
	{
		return Project.findElement(Users);
	}
	
	
	public void AddUsers() throws InterruptedException, IOException
	{
		loginProperties lp = new loginProperties(Project);
		
		//Access Users module
		AccessUsersModule().click();
		
		//Click "Add New" button
		Project.findElement(AddNewUser).click();
		
		//Wait 10 seconds before entering user name/email
		Thread.sleep(10000);
		
		//Enter new user Email address
		Project.findElement(AddUserEmail).sendKeys(lp.usernameValue(1,0,0));
		
		//Enter new user First Name
		Project.findElement(AddUserFirstName).sendKeys(lp.usernameValue(0,2,0));
		
		//Enter new user Last Name
		Project.findElement(AddUserLastName).sendKeys(lp.usernameValue(0,0,3));
		System.out.println("See OK");
		//Click "OK" on Add User modal
		Project.findElement(AddUserOK).click();
		System.out.println("OK clicked");
		
		Thread.sleep(20000);
		
		WebElement SuccessMsg = Project.findElement(AddUserModalSuccess);
		WebElement CreatedSuccessMsg = Project.findElement(AddUserModalCreatedSuccessMsg);
		String SuccessMsgText = SuccessMsg.getText();
		
		if(SuccessMsgText.length()!=0)
		{
			System.out.println(SuccessMsgText);
			System.out.println(CreatedSuccessMsg);
			
		}
		else
		{
			System.out.println("No SuccessMsgText");
		}
		
		//call screenshot method from TakeScreenShot class
		TakeScreenShot TSS = new TakeScreenShot();
		TSS.screenshot(Project, "Project", "AddUserConfirm");
		
		//Click "Close" button on success modal
		Project.findElement(AddUserClose).click();
		
		
		
	}
	
	public void CreatedUsers()
	{
		
	}
	 
	public void DelUsers() throws InterruptedException, IOException
	{
		loginProperties lp = new loginProperties(Project);
		
		//Access Users module
		AccessUsersModule().click();
		
		//Wait 10 seconds before clicking Toggle
		Thread.sleep(10000);
		
		//click on Toggle
		//ToggleUser
		Project.findElement(ToggleUser).click();;
		
		//Wait 10 seconds before Search
		Thread.sleep(10000);
		
		//Search the user in Search box. Enter user details in Search box
		Project.findElement(SearchUser).sendKeys(lp.usernameValue(2, 0, 0));
		
		//Wait 10 seconds before clicking Deactivate
		Thread.sleep(10000);
				
		//click Deactivate link DeactivateUser
		Project.findElement(DeactivateUser).click();
		
		//click OK
		Project.findElement(DeactivateUserOk).click();
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//click Close
		Project.findElement(DeactivateUserSuccessClose).click();
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		
		//Search the user to be deleted in Search box. Enter user details -email id- in Search box
		Project.findElement(SearchUser).sendKeys(lp.usernameValue(2, 0, 0));
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		
		//delete Deactivated user
		//verify if Delete link is visible
		String DeleteUserLink=Project.findElement(DeactivateUserDelete).getText();
		if(DeleteUserLink.equalsIgnoreCase("Delete"))
		{
			//click on Delete link
			Project.findElement(DeactivateUserDelete).click();
		}
		else
		{
			System.out.println("Element not found");
		}
		
		//Select new owner to reassign this 'to be deleted' user's assignments
		WebElement DeleteUserNewOwnerDD = Project.findElement((DeleteUserNewOwnerDdown));
		Select NewOwnerDdownClick = new Select(DeleteUserNewOwnerDD);
		NewOwnerDdownClick.selectByVisibleText("Admin, IDCTest (idc.test.adm@webappuat.com)");
		
		//click OK
		Project.findElement(DeleteUserNewOwnerOK).click();
		
		//click Close
				//Project.findElement(DeactivateUserSuccessClose).click();
				
		
		
		
		//*[@id="deleteUser"]/fieldset/div/section/div/div[8]/div/label/select
		/*WebElement UserDeactivateDelete = driver.findElement(By.xpath("//*[text()='Delete']"));
		 * if(textDemo.isDisplayed())
{
System.out.println("Element found using text");
}
 
else
System.out.println("Element not found");
driver.quit();
}
}
		 */
		//click Cancel
		//Project.findElement(by)
		/* Start Delete Script
		//Click "Add New" button
		Project.findElement(AddNewUser).click();
		
		//Wait 10 seconds before entering user name/email
		Thread.sleep(10000);
		
		//Enter new user Email address
		Project.findElement(AddUserEmail).sendKeys(lp.usernameValue(1,0,0));
		
		//Enter new user First Name
		Project.findElement(AddUserFirstName).sendKeys(lp.usernameValue(0,2,0));
		
		//Enter new user Last Name
		Project.findElement(AddUserLastName).sendKeys(lp.usernameValue(0,0,3));
		System.out.println("See OK");
		//Click "OK" on Add User modal
		Project.findElement(AddUserOK).click();
		System.out.println("OK clicked");
		
		Thread.sleep(20000);
		
		WebElement SuccessMsg = Project.findElement(AddUserModalSuccess);
		WebElement CreatedSuccessMsg = Project.findElement(AddUserModalCreatedSuccessMsg);
		String SuccessMsgText = SuccessMsg.getText();
		
		if(SuccessMsgText.length()!=0)
		{
			System.out.println(SuccessMsgText);
			System.out.println(CreatedSuccessMsg);
			
		}
		else
		{
			System.out.println("No SuccessMsgText");
		}
		
		//call screenshot method from TakeScreenShot class
		TakeScreenShot TSS = new TakeScreenShot();
		TSS.screenshot(Project, "Project", "AddUserConfirm");
		
		//Click "Close" button on success modal
		Project.findElement(AddUserClose).click();
		
		// End Delete Script
		
		*/
		
	}
	
	
	
	

}
