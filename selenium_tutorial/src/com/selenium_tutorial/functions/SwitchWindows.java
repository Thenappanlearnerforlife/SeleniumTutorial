package com.selenium_tutorial.functions;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-switch-windows/");
		driver.findElement(By.id("button1")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			System.out.println("Inside Loop");
			driver.switchTo().window(window);
		}
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.id("button1")).getText());

		/*
		 * driver.get(
		 * "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		 * driver.findElement(By.
		 * xpath("//*[text()='Prompt Alert box']/following::button[1]")).click();
		 * Thread.sleep(1000); Alert alert = driver.switchTo().alert();
		 * alert.sendKeys("Testing"); Thread.sleep(5000); alert.accept();
		 */

	}

}
