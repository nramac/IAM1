package org.vukfactory.iamone.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IAODrivers {
	
	public static WebDriver driver;
	
	@SuppressWarnings("static-access")
	DesiredCapabilities capabilities = new DesiredCapabilities().android();
	
	
	//This method will invoke Firefox driver
	public WebDriver setFirefoxBrowser() 
	{
		driver = new FirefoxDriver();
		return driver;
	}
	
	//This method will invoke chrome driver
		public WebDriver setChromeBrowser() 
		{
			driver = new ChromeDriver();
			return driver;
		}
	
	//This method will invoke Android driver with Chrome as Browser
	public WebDriver setAndroidBrowser(String sDeviceName, String sOSVersion, String sServerName) {

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("deviceName",sDeviceName);
        capabilities.setCapability("platformVersion", sOSVersion);
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app", "chrome");
        
        try {
			driver = new AndroidDriver(new URL(sServerName), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	//This method will invoke Android driver with Chrome as Browser
	public WebDriver setIPhoneBrowser(String sMacServerName,String sDeviceName, String sOSVersion, String sServerName) {

	try {
				driver = new IOSDriver(new URL(sServerName), capabilities);
		} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return driver;
		}
	
	//This method will invoke Android driver with Chrome as Browser
		public AndroidDriver setAndroidApp(String sDeviceName, String sOSVersion,String sAppPath,String sPackageName, String sActivityName,String sServerName) {

			File fappPath = new File(sAppPath);
	        capabilities.setCapability("deviceName",sDeviceName);
	        capabilities.setCapability("platformVersion", sOSVersion);
	        capabilities.setCapability("platformName","Android");
	        capabilities.setCapability("app", fappPath.getAbsolutePath());
	        capabilities.setCapability("appPackage", sPackageName);
	        capabilities.setCapability("appActivity", sActivityName);
	        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
	        capabilities.setCapability("autoWebview", true);
	        
	        try {
				driver = new AndroidDriver(new URL(sServerName), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return (AndroidDriver) driver;
		}
	
	public void closeDriverSession(WebDriver driver) 
	{
			driver.quit();
	}	
}
