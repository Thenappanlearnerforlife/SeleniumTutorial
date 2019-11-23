package com.selenium_tutorial.testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test(groups = {"regression"}, dependsOnGroups = "smoke")
	public void firstTC() {
		System.out.println("First TC");
	}
	
	@Test(groups = {"regression", "smoke"})
	public void SecondTC() {
		System.out.println("Second TC");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

}
