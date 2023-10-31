package org.wipro.automation.fb.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.fb.utilities.PropUtilties;


public class InitiateBrowser 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(PropUtilties.readconfig("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();  //launch a chrome browser
		}
		
		else if(PropUtilties.readconfig("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();  //launch a chrome browser
		}
		
		else
		{
			driver = new ChromeDriver();  //launch a chrome browser
		}
		
		driver.get(PropUtilties.readconfig("ApplicationURL")); //default wait time 60 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
