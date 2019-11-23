package com.selenium_tutorial.functions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		Select s=new Select(driver.findElement(By.xpath("//Select[@id='multi-select']")));
		
		s.selectByValue("California");
		
		s.selectByIndex(4);
		
		s.selectByVisibleText("Washington");
		
		s.selectByVisibleText("Pennsylvania");
		
		s.deselectByVisibleText("Pennsylvania");
		
		
		
		List<WebElement> multiselect_option=s.getOptions();
		
		Iterator<WebElement> it=multiselect_option.iterator();
		
		while(it.hasNext())
		{
			
			System.err.println(it.next().getText());	
			
		}
		
		System.out.println(s.getFirstSelectedOption().getText());
		
	
		
		List<WebElement> selected_all_option=s.getAllSelectedOptions();
		
		int selected_all_option_size=selected_all_option.size();
		
		
		for(int i=0;i<selected_all_option_size;i++)
		{
			
			System.out.println(selected_all_option.get(i).getText());
			
		}
		
		
		
		

	}

}
