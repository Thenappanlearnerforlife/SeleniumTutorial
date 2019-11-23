package com.selenium_tutorial.testNG;

import org.testng.annotations.Test;

public class Dependencies {
	
	
	@Test(priority=0)
	public void highClass()
	{
		System.out.println("High School");
	}
	
	@Test(priority=1,dependsOnMethods="highClass",enabled=false)
	public void higherSecondary()
	{
		System.out.println("Higher Secondary");
	}
	
	@Test(priority=2,dependsOnMethods="higerSecondary")
	public void engineering()
	{
		System.out.println("Engineering");
	}

}
