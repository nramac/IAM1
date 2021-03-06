package org.vukfactory.iamone.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IAOPageWaits {
	WebDriverWait wait;
	public void setIWaitS(WebDriver driver, int Seconds)
	{
		driver.manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);
	}
	public void setIWaitM(WebDriver driver, int Minutes)
	{
		driver.manage().timeouts().implicitlyWait(Minutes, TimeUnit.MINUTES);
	}
	public void setIWaitH(WebDriver driver, int Seconds)
	{
		driver.manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);
	}
	public void setEWait(WebDriver driver, String sDomType, String sUIReference, int iTimeSeconds)
	{
		wait = new WebDriverWait(driver, iTimeSeconds);
		if(sDomType.equals("linkText"))
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(sUIReference)));
		}
		
	}
	
	public void setEWait_InvisibilityOfElement(WebDriver driver, String sDomType, String sUIReference, int iTimeSeconds)
	{
		wait = new WebDriverWait(driver, iTimeSeconds);
		if(sDomType.equals("linkText"))
		{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(sUIReference)));
		}
	}
	
	public void setEWait_PresenceOfElement(WebDriver driver, String sDomType, String sUIReference, int iTimeSeconds)
	{
		wait = new WebDriverWait(driver, iTimeSeconds);
		if(sDomType.equals("linkText"))
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(sUIReference)));
		}
	}

}
