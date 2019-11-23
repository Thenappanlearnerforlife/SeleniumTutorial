package com.selenium_tutorial.functions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] Args)
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		//driver.findElement(By.xpath("//input[text()='Option2']")).click();
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		Iterator<WebElement> ch=checkbox.iterator();
		 while(ch.hasNext())
		 {
			 
			 ch.next().click();
			 
		 }
		 
		 System.out.println((checkbox.get(3).isSelected()));
		 checkbox.get(3).click();
		 System.out.println(checkbox.get(3).isSelected());
		 
		 System.out.println(checkbox.get(3).isEnabled());
		 
		 System.out.println(checkbox.get(3).isDisplayed());
		 
		 
		 
		 
		 
		
		
		
	}

}
