package com.selenium_tutorial.functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		driver.manage().window().maximize();
		int s=driver.findElements(By.xpath("//input[@name='optradio']")).size();
		System.out.println(s);
		
		for(int i=0;i<s;i++)
		{
			String text=driver.findElements(By.xpath("//input[@name='optradio']")).get(i).getAttribute("value");
			
			//System.out.println(text);
			if(text.equalsIgnoreCase("female"))
			{
				driver.findElements(By.xpath("//input[@name='optradio']")).get(i).click();
			}
		
		}
		
		driver.findElement(By.xpath("//button[text()='Get Checked value']")).click();
		
		System.err.println(driver.findElement(By.className("radiobutton")).getText());
		
		
	
		System.out.println(driver.findElements(By.xpath("//input[@name='ageGroup']")).size());

	}
	
	

}
