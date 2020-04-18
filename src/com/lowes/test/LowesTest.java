package com.lowes.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowesTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true"); // Stops showing starting chrome browser...... in the console
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://www.lowes.com/");
		
		// 1. confirm title of lowes homepage
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Lowe's Home Improvement"))
		{
			System.out.println("Lowes web page is launched and title is confirmed");
		}

		driver.close();
	}

}
