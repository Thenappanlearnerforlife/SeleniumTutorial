package com.selenium_tutorial.functions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html");
		
		
		driver.manage().window().maximize();
		List<WebElement> dual=driver.findElements(By.xpath("//div[@class='well text-right']/ul/li"));
		int count=dual.size();
		
		
		for(int j=0;j<count;j++)
		{
			dual.get(j).click();
		}
		
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']")).click();
		
		List<WebElement> rl=driver.findElements(By.xpath("//div[@class='dual-list list-right col-md-5']/div/ul/li"));
		
		System.out.println(rl.size());
		
//		System.out.println(rl.lastIndexOf("Dapibus ac facilisis in"));//Not working
		
		System.err.println(rl.get(0).getText().contains("Cras justo odio"));
		
	}

	
	
}
