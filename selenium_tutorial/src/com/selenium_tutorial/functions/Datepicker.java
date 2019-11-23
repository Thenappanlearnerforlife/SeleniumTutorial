package com.selenium_tutorial.functions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/bus-tickets/");

		driver.findElement(By.xpath("//input[@id='travelDate']")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("IF1")));
		driver.switchTo().defaultContent();
		
		Wait wait  = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.)
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, "D://Sceenshot.png");
		

	}

}
