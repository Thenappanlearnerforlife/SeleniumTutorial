package practice_advance_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/upload.html");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@id='mydiv']/input")).click();
		
		System.out.println("Click operation Completed");
		StringSelection selection=new StringSelection("C:\\Users\\Thenappan Saravanan\\Downloads\\Book2.xlsx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//For Performing window based operation using Robot Class
		
		Robot ro=new Robot();
		
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_V);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

	}

}