package org.xyz.automation.uo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserControl 
{
	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("fld_username")).sendKeys("selenium");
		driver.findElement(By.cssSelector("[value='office']")).click();
		driver.findElement(By.name("terms")).click();
	//	driver.findElement(By.className("displayPopup")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(2);
		//gen.selectByValue("1");
		gen.selectByVisibleText("Female");
		
		Select con = new Select(driver.findElement(By.name("country")));
		//con.selectByValue("21");
		con.selectByVisibleText("India");
		//con.deselectByVisibleText("India");
		//con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Goa"));
		
		st.selectByVisibleText("Telangana");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Khammam"));
		
		ct.selectByVisibleText("Hyderabad");
		
		/*
		Thread.sleep(5000);
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		//difference between get method and navigate method
		
		//driver.close(); //close only one window
		driver.quit();  //close all the window
		*/
	}
	
}
