package practice_advance_selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/selectable.html");
		
		List<WebElement> selectable=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		System.err.println(selectable.size());
		
		Iterator<WebElement> it=selectable.iterator();
		Actions a=new Actions(driver);
		
		while(it.hasNext())
		{
			WebElement s=it.next();
			a.clickAndHold(s);
			
			if(s.getText().equalsIgnoreCase("Item 3"))
			{
				
				a.clickAndHold(s).release(s).build().perform();
				break;
				
			}
		}
		
		/*Actions a=new Actions(driver);*/
		a.keyDown(Keys.CONTROL).click(selectable.get(5))
		.click(selectable.get(6)).build().perform();

		
		
		
		
		
		
		
		

	}

}
