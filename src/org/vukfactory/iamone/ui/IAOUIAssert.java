package org.vukfactory.iamone.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class IAOUIAssert
{
	public void assertEquals(WebDriver driver,String sDomType, String sUIReference, String expectedValue, String sActualValue)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertEquals(sActualValue, driver.findElement(By.cssSelector(sUIReference)).getText());
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertEquals(sActualValue, driver.findElement(By.cssSelector(sUIReference)).getText());
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertEquals(sActualValue, driver.findElement(By.cssSelector(sUIReference)).getText());
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertEquals(sActualValue, driver.findElement(By.cssSelector(sUIReference)).getText());
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertEquals(sActualValue, driver.findElement(By.cssSelector(sUIReference)).getText());
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertEquals(sActualValue, driver.findElement(By.cssSelector(sUIReference)).getText());
		}

	}
}
