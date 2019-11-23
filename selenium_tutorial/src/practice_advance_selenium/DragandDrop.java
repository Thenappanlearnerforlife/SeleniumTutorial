package practice_advance_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/drop.html");
		
		WebElement From=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement To=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a=new Actions(driver);
		
		//a.dragAndDrop(From, To).build().perform();
		
		a.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		//a.dragAndDrop(From, To).build().perform();
		
		//a.clickAndHold(From).moveToElement(To).build().perform();
		//a.clickAndHold(From).moveToElement(To).build().perform();

	}

}
