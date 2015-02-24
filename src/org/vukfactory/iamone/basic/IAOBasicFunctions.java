package org.vukfactory.iamone.basic;

import org.openqa.selenium.WebDriver;

public class IAOBasicFunctions 
{
	public void clearCookies(WebDriver driver) throws InterruptedException 
	{
		driver.manage().deleteAllCookies();
		Thread.sleep(5000); //wait 5 seconds to clear cookies.
	}
	
	public void openUrlInBrowser(WebDriver driver,String url)
	{
		driver.get(url);
		
	}
}
