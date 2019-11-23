package com.selenium_tutorial.functions;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basics {
	public static final By EMAIL = By.xpath("//input[@id='email']");

	public static void main(String[] args) {
		Select select;

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium
		// Jars\\ChromeDriver\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.get("https://google.com");
//		driver.manage().window().

		// HashMap<String, ArrayList<String>> = new HashMap<String,
		// ArrayList<String>>();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// Maximize the browser window

		driver.get("https://www.facebook.com");

		WebElement element;

		element = driver.findElement(EMAIL);
		element.sendKeys("sm.thenappan98@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcd@4278");
		// System.out.println(driver.findElement(By.id("u_0_4")).getSize());

		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
		// driver.findElement(By.xpath("//label[@id='loginbutton']
		// //input[@id='u_0_4']")).click();
		// driver.close();

		select = new Select(driver.findElement(By.id("select-demo")));
		select.selectByVisibleText("Monday");
		
		select = new Select(driver.findElement(By.id("multi-select")));
		select.selectByVisibleText("California");
		select.selectByVisibleText("Texas");
		
		Dimension dim = driver.findElement(By.id("printMe")).getSize();
//		dim.height

	}

}
