package com.selenium_tutorial.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Launch modal")).click();
		
		Thread.sleep(100);
		
		//driver.switchTo().alert();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']")).getText());
		
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[@onclick='history.go(0)']")).click();
		
		driver.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		
		org.openqa.selenium.Alert al=driver.switchTo().alert();
		
		al.sendKeys("Selenium");
		
		al.accept();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		

	}

}
