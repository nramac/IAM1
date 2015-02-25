package org.vukfactory.iamone.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class IAOUIAssert
{
	IAOPageInteraction objPageInteraction = new IAOPageInteraction();
	
	public void assertEquals(WebDriver driver,String sActualValue,String sDomType, String sUIReference)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertEquals(sActualValue, objPageInteraction.byLinkText(driver, sUIReference));
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertEquals(sActualValue, objPageInteraction.byId(driver, sUIReference));
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertEquals(sActualValue, objPageInteraction.byclassName(driver, sUIReference));
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertEquals(sActualValue, objPageInteraction.byName(driver, sUIReference));
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertEquals(sActualValue, objPageInteraction.byXpath(driver, sUIReference));
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertEquals(sActualValue, objPageInteraction.byCSSPath(driver, sUIReference));
		}
	}
	public void assertEquals(String sActualValue,String sExpectedValue)
	{
		Assert.assertEquals(sActualValue, sExpectedValue);
	}
	
	public void assertTrue(WebDriver driver,String sDomType, String sUIReference)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertTrue(objPageInteraction.isElementPresent(driver,By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertTrue(objPageInteraction.isElementPresent(driver,By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertTrue(objPageInteraction.isElementPresent(driver,By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertTrue(objPageInteraction.isElementPresent(driver,By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertTrue(objPageInteraction.isElementPresent(driver,By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertTrue(objPageInteraction.isElementPresent(driver,By.cssSelector(sUIReference)));
		}
	}
	
	public void assertFalse(WebDriver driver,String sDomType, String sUIReference)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertFalse(objPageInteraction.isElementPresent(driver,By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertFalse(objPageInteraction.isElementPresent(driver,By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertFalse(objPageInteraction.isElementPresent(driver,By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertFalse(objPageInteraction.isElementPresent(driver,By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertFalse(objPageInteraction.isElementPresent(driver,By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertFalse(objPageInteraction.isElementPresent(driver,By.cssSelector(sUIReference)));
		}
	}


}
