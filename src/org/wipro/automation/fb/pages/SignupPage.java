package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilities.PropUtilties;

public class SignupPage  
{
	WebDriver driver;  //global variable

	public SignupPage(WebDriver driver)  //local variable
	{
		this.driver=driver;
	}
	
	
	public void click_CreateNewAcctBttn() throws Exception
	{
		driver.findElement(By.xpath(PropUtilties.readelement("fb_login_createnewaccount_xpath"))).click();
	}

	public void enter_firstame(String fname) throws Exception
	{
		driver.findElement(By.name(PropUtilties.readelement("fb_signup_firstname_name"))).sendKeys(fname);
	}
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(PropUtilties.readelement("fb_signup_lastname_name"))).sendKeys(lname);
	}
	
	public void click_Signupbttn() throws Exception
	{
		driver.findElement(By.name(PropUtilties.readelement("fb_signup_bttn_signup_name"))).click();
	}
}
