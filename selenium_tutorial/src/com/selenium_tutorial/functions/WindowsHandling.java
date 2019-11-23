package com.selenium_tutorial.functions;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Follow Twitter & Facebook']")).click();
		System.out.println(driver.getTitle());
		String Parentwindow=driver.getWindowHandle();
		
		System.err.println(Parentwindow);
		
		Set<String> s1=driver.getWindowHandles();
		
		System.out.println(s1.size());
		
		Iterator<String> s2=s1.iterator();
		
		while(s2.hasNext())
		{
			driver.switchTo().window(s2.next());
			System.err.println(driver.getTitle());
			
		}
		
		driver.switchTo().window(Parentwindow);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//li[@class='tree-branch'][3]")).click();
		

	}

}
