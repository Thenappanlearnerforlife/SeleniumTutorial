package com.selenium_tutorial.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviders {

	@DataProvider(name = "SampleDataProvider")
	public Object[][] methodImplementation(){
		return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@124" }};	
		
	}
	
	@Test(dataProvider = "SampleDataProvider")
	public void dataProviderTC(String username, String password) {
		System.out.println("Username is" + username);
		System.out.println("Password is" + password);
	}
}
