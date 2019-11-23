package com.selenium_tutorial.functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().window().maximize();
		
		//Method 1 Row wise Iteration
		
		/*List<WebElement> s=driver.findElements(By.xpath("//table[@id='task-table']/thead/following::tr"));
		
		System.out.println("Size:"+s.size());
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i).getText());
		}*/
		
		//Method 2 Row wise iteration
		List<WebElement> s1=driver.findElements(By.xpath("//table[@id='task-table']/tbody/child::tr"));
		System.out.println("Size:"+s1.size());
		for(int i=0;i<s1.size();i++)
		{
			System.err.println(s1.get(i).getText());
		}
		
		String s2="//table[@id='task-table']/tbody/tr[";
		
		String s3="]";
		
	
				
		
		
		
		/*//System.out.println("Size:"+columwise.size());
		for(int i=0;i<s1.size();i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(s2+i+s3.getText());
			}
			System.out.println("");
			
		}*/
		

	}

}
