package org.xyz.automation.uo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
		driver.get("https://www.facebook.com/"); //default wait time 60 secs
		//driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	

	@Test(enabled=false)
	public void loginfunc()
	{
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass12345");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@Test
	public void signupfunc() throws Exception
	{
		 
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		boolean ActFlag = driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
		System.out.println(ActFlag);
		Assert.assertEquals(ActFlag, false);
		
	}
}
