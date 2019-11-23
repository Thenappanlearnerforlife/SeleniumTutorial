package practice_advance_selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestiveTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		

		
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("P");
		//Thread.sleep(4000);
		
		//WebDriverWait wt=new WebDriverWait(driver,10);
		
		//wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']/li")));
				
				//visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"))));
		
		List<WebElement> autosuggest=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		System.err.println(autosuggest.size());
		
		Iterator<WebElement> autotextbox=autosuggest.iterator();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']/li")));
		
		while(autotextbox.hasNext())
		{
			WebElement s=autotextbox.next();
			System.out.println(s.getText());
			if(s.getText().equals("Protractor"))
			{
				s.click();
				break;
			}
			
		}
		
	}

}
