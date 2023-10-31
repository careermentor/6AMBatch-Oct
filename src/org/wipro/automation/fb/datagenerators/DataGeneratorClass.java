package org.wipro.automation.fb.datagenerators;

import org.testng.annotations.DataProvider;

public class DataGeneratorClass 
{

	@DataProvider(name="staticdata")
	public Object[][] testdata()
	{
		//Object[] username = {"user1","user2"};   ///1-D array
		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-D array
		return data;
		
	}
	
}
