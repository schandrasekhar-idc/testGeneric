package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

//import credentials.ElementLocators;
//import objectRepository.LoginPage;
//import objectRepository.HomePage;
//import objectRepository.MyProfilePage;

public class LaunchAllBrowsersTest 
{
	
	
		
	@Test
	public void TC_MyProfile() throws InterruptedException
	{
		//Firefox Launch
		//=====================================================================================================
		System.setProperty("webdriver.gecko.driver", "C://sarath_eclipse//sarath_eclipse_jars//geckodriver-v0.26.0-win32//geckodriver.exe");
		WebDriver ProjectFirefox = new FirefoxDriver();
		System.out.println("Firefox launched cs");
		
		//maximize browser
		ProjectFirefox.manage().window().maximize();
		ProjectFirefox.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ProjectFirefox.get("https://dev-Projectroi.webappuat.com");
		
		//Chrome Launch
		//======================================================================================================
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver ProjectChrome = new ChromeDriver();
		System.out.println("Chrome launched cs");
		
		//maximize browser
		ProjectChrome.manage().window().maximize();
		ProjectChrome.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ProjectChrome.get("https://dev-Projectroi.webappuat.com");
		
		//Edge Launch
		//======================================================================================================
		System.setProperty("webdriver.edge.driver", "C://Windows//System32//MicrosoftWebDriver.exe");
		WebDriver ProjectEdge = new EdgeDriver();
		System.out.println("MicrosoftEdge launched cs");
		
		//maximize browser
		ProjectEdge.manage().window().maximize();
		ProjectEdge.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ProjectEdge.get("https://dev-Projectroi.webappuat.com");
		
		//Opera Launch
		//======================================================================================================
			
		System.setProperty("webdriver.opera.driver","C://sarath_eclipse//sarath_eclipse_jars//operadriver_win64//operadriver_win64//operadriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		OperaOptions options = new OperaOptions();
		options.setBinary("C://Users//schandrasekhar//AppData//Local//Programs//Opera//65.0.3467.48//Opera.exe");
		capabilities.setCapability(OperaOptions.CAPABILITY, options);
		@SuppressWarnings("deprecation")
		OperaDriver ProjectOpera = new OperaDriver(capabilities);
		
		System.out.println("Opera launched cs");
		
		//maximize browser
		ProjectOpera.manage().window().maximize();
		ProjectOpera.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ProjectOpera.get("https://dev-Projectroi.webappuat.com");
		
		
						
	}
	
	

}
