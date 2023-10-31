package org.xyz.automation.uo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SaveScreenshot 
{

	
	
	public static void testResultsScreens(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./Results/"+ name + ".png");
		
	//	int a = 30;
		//System.out.println("print value of a:" + a + "this is integer");
		
		FileUtils.copyFile(f, fd);
		
	}
	
	
}
