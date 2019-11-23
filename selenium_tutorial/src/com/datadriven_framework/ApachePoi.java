package com.datadriven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("C:\\Users\\Thenappan Saravanan\\Desktop\\UserLogin.xls");
		Workbook wk=new HSSFWorkbook(file);
		
		System.out.println("Hello");
		Sheet sheet=wk.getSheetAt(0);
		
		System.out.println(sheet.getLastRowNum());
		
		//To Iterate a row
		 
		//Iterator<Row> rows=sheet.iterator();
		
		//To iterate a Coloumn
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			
			
			String Username=sheet.getRow(i).getCell(0).getStringCellValue();
			
			String Password=sheet.getRow(i).getCell(1).getStringCellValue();
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validatecredentials");
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(Username);
			driver.findElement(By.id("txtPassword")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			
		}
		
		
		
	
	
		
	}
	
}
