package practice_advance_selenium;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://leafground.com/pages/table.html");
		
		WebElement table=driver.findElement(By.xpath("//table[@id='table_id']"));
		
		table.click();
		
		
		//To find the no of rows
		
	
		
		java.util.List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr/following-sibling::tr"));
		
		int row_size=rows.size();
		System.out.println("row:"+row_size);
		
		//Find the no of rows including header record
		
		java.util.List<WebElement> rows1=driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr"));
		
		System.out.println("Include Header rows count: "+rows1.size());
		
		//To Find no of columns
		
		java.util.List<WebElement> columns=driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr[1]/th"));
		
		int cols_size=columns.size();
		
		System.err.println("Col Count: "+columns.size());
		//table[@id='table_id']/tbody/tr/following-sibling::tr
		
		//table[@id='table_id']/tbody/tr/follwing-sibling::tr
		
		
		String s1="//table[@id='table_id']/tbody/tr[";
		
		String s2="]/td[1]";
		
		/*for(int i=1;i<=row_size;i++)
		{
			
			System.out.println(driver.findElement(By.xpath(s1+(i+1)+s2)).getText());	
		}*/
		
		
		for(int i=1;i<=row_size;i++)
		{
			
			for(int j=1;j<cols_size-4;j++)
			{
				String text=driver.findElement(By.xpath(s1+(i+1)+s2)).getText();
				
				if(text.equals("Learn to interact with Elements"))
				{
					System.err.println(driver.findElement(By.xpath(s1+(i+1)+s2+"/following-sibling::td[1]")).getText());
					break;
					
				}
			}
			
		}
		
		
		//To find the minimum percentage
		
		java.util.List<Integer> listpercentage=new ArrayList<Integer>();
		
		for(int k=1;k<=row_size;k++)
		{
			
			String s5=driver.findElement(By.xpath(s1+(k+1)+s2+"/following-sibling::td[1]")).getText();
			
			
			
			
			listpercentage.add(Integer.parseInt(s5.replace("%", "")));
			
		}
		
		int least_val_pos=Collections.min(listpercentage);
		
		System.err.println(least_val_pos);
		
		for(int i=1;i<=row_size;i++)
		{
			
			
				String text=driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr["+(i+1)+"]/td[2]")).getText();
				
				System.out.println(text);
				
				if(text.contains(Integer.toString(least_val_pos)))
				{
					System.out.println("Enter");
					driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr["+(i+1)+"]/td[2]/following-sibling::td[1]")).click();
					break;	
				}
				
				
			
			
		}	
		
		

	}

}
