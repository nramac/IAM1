package com.util;


import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class VUKBaseKeyword {
	
	public WebDriver driver;
	
	public WebDriver setBrowser(String sBrowserName) {
		if(sBrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		}
		else if(sBrowserName.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
		return driver;
	}
	public WebDriver setBrowser(String sBrowserName,String sDeviceName, String sOSVersion) {
	if(sBrowserName.equalsIgnoreCase("android"))
	{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("deviceName",sDeviceName);
        capabilities.setCapability("platformVersion", sOSVersion);
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app", "chrome");
        
        try {
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Started the Chrome driver .......");
	}
	return driver;
	}
	public void tearDown(WebDriver driver,String sBrowserName) {
		driver.close();
	}
}
