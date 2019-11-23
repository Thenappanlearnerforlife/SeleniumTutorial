package com.selenium_tutorial.functions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		Select s=new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		
		s.selectByIndex(1);
		s.selectByVisibleText("Thursday");
		s.selectByValue("Tuesday");
		
		List<WebElement> opt=s.getOptions();
		Iterator<WebElement> s1=opt.iterator();
		while(s1.hasNext())
		{
			//System.out.println(s1.next().getText());
			//System.out.println(s1.next().getAttribute("value"));
			System.err.println(s1.next());//it store the Xpath of the element & its child tagname(Option)
			
		}
		//Multiple Select Drop down
		
		Select s2=new Select(driver.findElement(By.id("multi-select")));
		
		s2.selectByIndex(1);
		s2.selectByIndex(3);
		s2.selectByIndex(7);
		//s2.deselectByIndex(3);
		
		
		

	}

}
