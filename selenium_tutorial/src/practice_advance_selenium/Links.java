package practice_advance_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://leafground.com/pages/Link.html");
		
		WebElement home=driver.findElement(By.linkText("Go to Home Page"));
		
		home.click();
		
		driver.navigate().back();
		
		System.out.println("Link Goes to:"+driver.findElement(By.partialLinkText("supposed to go")).getAttribute("href"));

		driver.findElement(By.linkText("Verify am I broken?")).click();
		
		if(driver.getTitle().contains("404-Not Found"))
				{
					System.out.println("Link is broken");
				}
		
		driver.navigate().back();
		
		//home.click();// Stale element Reference Exception Occurs
		
	List<WebElement> LinkCount=driver.findElements(By.tagName("a"));
	
	System.out.println(LinkCount.size());
	
		
	}

}
