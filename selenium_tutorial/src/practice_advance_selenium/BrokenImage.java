package practice_advance_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com");
		
		driver.findElement(By.xpath("//img[@src='images/image.png']")).click();
		
		WebElement img1=driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		
		if(img1.getAttribute("naturalWidth").equals("0"))
				{
					System.out.println("Broken");
				}
		else
		{
			System.out.println("Not Broken");
		}

	}

}
