package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario4 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
		Assert.assertEquals("Hello", "Helloooo");   //hard assertion
		
		System.out.println("this test case is failed");
		
	}
	
	@Test(groups="SmokeTest")
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
}
