package com.util;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VUKBaseKeyword {
	
	public WebDriver driver;
	
	public WebDriver setBrowser(String sBrowserName) {
		if(sBrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		}
		if(sBrowserName.equalsIgnoreCase("android"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		}
		return driver;
	}
	public void tearDown(WebDriver driver,String sBrowserName) {
		driver.close();
	}
}
