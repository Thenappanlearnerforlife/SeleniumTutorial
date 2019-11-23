package com.datadriven_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	
	Object[][] data= {{"Admin","admin123"},{"Admin","admin"}};
	
	//Username & Password are stored in the Object array
	@org.testng.annotations.DataProvider(name="LoginApp")
	public Object[][] dataprovider()
	{
		return data;
	}
	
	@Test(dataProvider="LoginApp")
	public void ApplicationLogin(String Uname,String Pwd)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validatecredentials");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(Uname);
		driver.findElement(By.id("txtPassword")).sendKeys(Pwd);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}

}
