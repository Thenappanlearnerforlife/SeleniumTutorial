package com.selenium_tutorial.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Welcome");
		
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		
		String s=driver.findElement(By.xpath("//div[contains(@id,'user-message')]")).getText();
		
		if(s.contains("Welcome"))
		{
			System.out.println("String matches");
		
		}
		else
		{
			System.out.println("String Mismatch");
		}
		
		

	}

}
