package com.selenium_tutorial.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;

public class FlightSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).click();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chennai");
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Trichy");
		
		driver.findElement(By.id("onward_cal")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[2]")).getText();
		
		
		TouchActions action = new TouchActions(driver);
		action.dragAndDrop(driver.findElement(By.id("d")), driver.findElement(By.id("d"))).perform();
		action.longPress(driver.findElement(By.id("d"))).move(0, 50).release().build().perform();
		
		Actions actions = new Actions(driver);
	}

}
