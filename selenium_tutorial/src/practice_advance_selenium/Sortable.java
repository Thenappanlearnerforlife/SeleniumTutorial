package practice_advance_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/sortable.html");
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		Actions a=new Actions(driver);
		
		WebElement FromElement=list1.get(6);
		
		WebElement ToElement=list1.get(0);
		
		a.clickAndHold(FromElement).moveToElement(ToElement).release().build().perform();
		
		//a.dragAndDrop(FromElement, ToElement).build().perform();
		
	
		
		
	
	}

}
