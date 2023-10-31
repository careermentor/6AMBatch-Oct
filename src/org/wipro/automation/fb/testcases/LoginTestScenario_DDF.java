package org.wipro.automation.fb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.datagenerators.DataGeneratorClass;
import org.wipro.automation.fb.pages.LogingPage;

public class LoginTestScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="staticdata",dataProviderClass=DataGeneratorClass.class)
	public void loginFunc(String username, String password) throws Exception
	{
		LogingPage login = new LogingPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
	
	
}
