package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilities.PropUtilties;

public class LogingPage  
{
	WebDriver driver;  //global variable

	public LogingPage(WebDriver driver)  //local variable
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(PropUtilties.readelement("fb_login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(PropUtilties.readelement("fb_login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(PropUtilties.readelement("fb_login_loginbttn_css"))).click();
	}
}
