package com.datadriven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataDriven {
	
	WebDriver driver;
	
	@BeforeTest
	public void webdriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void ExcelDriven() throws BiffException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Thenappan Saravanan\\Desktop\\UserLogin.xls");
		Workbook wk=Workbook.getWorkbook(file);
		
		Sheet sheet=wk.getSheet("Sheet1");
		
		int row_count=sheet.getRows();
		
		System.out.println(row_count);
		
		
		int column_count=sheet.getColumns();
		
		System.out.println(column_count);
		
		for(int i=1;i<row_count;i++)
		{
			for(int j=0;j<column_count-1;j++)
			{
				
				String Username=sheet.getCell(j, i).getContents();
				
				System.out.println(Username);
				
				String password=sheet.getCell(j+1, i).getContents();
				
				System.out.println(password);
				
				driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validatecredentials");
				driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(Username);
				driver.findElement(By.id("txtPassword")).sendKeys(password);
				driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
				
				
			}
			
		}
		
		
	
	}
	
	

}
