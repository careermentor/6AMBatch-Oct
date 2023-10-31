package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.pages.LogingPage;

public class LoginTestScenario extends InitiateBrowser
{

	@Test
	public void loginFunc() throws Exception
	{
		LogingPage login = new LogingPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
		
	}
	
}
