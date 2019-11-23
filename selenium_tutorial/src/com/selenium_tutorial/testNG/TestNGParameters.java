package com.selenium_tutorial.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

	@Parameters({"username", "password" })
	@Test
	public void parametrizedTC(String user, String passcode) {
		System.out.println("Username is " + user);
		System.out.println("Password is " + passcode);
	}

}
