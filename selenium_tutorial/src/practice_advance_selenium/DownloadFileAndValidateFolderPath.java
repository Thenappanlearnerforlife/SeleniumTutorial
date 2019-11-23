package practice_advance_selenium;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileAndValidateFolderPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/download.html");
		
		driver.findElement(By.linkText("Download Excel")).click();
		
		/*Set<String> windows=driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		driver.findElement(By.xpath("//div[@id='icon']")).click();*/
		//Thread.sleep(4000);
		
		File file=new File("C:\\Users\\Thenappan Saravanan\\Downloads");
		
		File[] totalfile=file.listFiles();
		
		for(File files1:totalfile)
		{
			System.out.println("File name: "+files1.getName());
			if(files1.getName().equalsIgnoreCase("testleaf.xlsx"))
			{
				System.out.println("File is Present");
				break;
			}
		}
		
	}

}
