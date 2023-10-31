package org.xyz.automation.uo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRunTime 
{
	WebDriver driver;
	
	@Test
	public void loginfunc()
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
	
		String ExpURL = "https://www.facebook.com/";
		
		driver.get(ExpURL);
		
		//Step1
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ActURL, ExpURL,"URL did not matched");  //assertion - Soft
		
		//Assert.assertEquals(ActURL, ExpURL,"URL did not matched");  //assertion - Hard 
		System.out.println("This is testcase executed successfully");
		
		
		//Title page - step2
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle,"Title did not matched");  //assertion - Soft
		System.out.println("This is testcase executed successfully");
		
		//username or email field
		String ExpEmailTB = "Email address or phone number";
		String ActEmailTB = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActEmailTB);
		sa.assertEquals(ActEmailTB, ExpEmailTB,"email textbox did not matched");  //assertion - Soft
		System.out.println("This is testcase executed successfully");
		
		//Password field
		String ExpPassTB = "Password";
		String ActPassTB = driver.findElement(By.id("pass")).getAttribute("placeholder");
		System.out.println(ActPassTB);
		sa.assertEquals(ActPassTB, ExpPassTB,"pass textbox did not matched");  //assertion - Soft
		System.out.println("This is testcase executed successfully");
		
		String ExpLogin = "Log in";
		String ActLogin = driver.findElement(By.name("login")).getText();
		System.out.println(ActLogin);
		sa.assertEquals(ActLogin, ExpLogin,"login button did not matched");  //assertion - Soft
		System.out.println("This is testcase executed successfully");
		
		String ExpText = "Facebook helps you connect and share with the people in your life.";
		String ActText = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).getText();
		System.out.println(ActText);
		sa.assertEquals(ActText, ExpText,"text did not matched");  //assertion - Soft
		System.out.println("This is testcase executed successfully");
		
		System.out.println(driver.findElement(By.name("login")).getLocation());
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.findElement(By.name("login")).isEnabled());
		
		driver.close();
		
		sa.assertAll();
		
	}
		
}
