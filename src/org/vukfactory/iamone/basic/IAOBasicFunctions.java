package org.vukfactory.iamone.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class IAOBasicFunctions 
{
	public void clearBrowserCookies(WebDriver driver) throws InterruptedException 
	{
		driver.manage().deleteAllCookies();
		Thread.sleep(5000); //wait 5 seconds to clear cookies.
	}
	
	public void openUrlInMobile(WebDriver driver,String url)
	{
		driver.get(url);
		
	}
	public boolean isElementPresent(WebDriver driver,By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	}
}
