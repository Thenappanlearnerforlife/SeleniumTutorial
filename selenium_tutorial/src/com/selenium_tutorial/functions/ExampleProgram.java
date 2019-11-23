package com.selenium_tutorial.functions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\ChromeDriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");

		// Retrieve the data based on Row wise

		List<WebElement> table = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.err.println(table.size());

		Iterator<WebElement> s = table.iterator();

		while (s.hasNext()) {
			System.out.println(s.next().getText());
		}

		// Retrieve data based on column wise

		// table[@id='task-table']/tbody/tr[1]/following::td

		String s1 = "//table[@id='task-table']/tbody/tr[";

		String s2 = "]/td";
		int columnCount = driver.findElements(By.xpath(s1 + 1 + s2)).size();

		for (int i = 1; i <= table.size(); i++) {

			for (int j = 0; j < columnCount; j++) {

				System.err.print(driver.findElement(By.xpath(s1 + j + s2)).getText() + " ");

			}

			System.out.println("");

		}

	}

}
