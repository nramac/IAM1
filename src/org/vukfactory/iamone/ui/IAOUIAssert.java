package org.vukfactory.iamone.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class IAOUIAssert
{
	IAOPageInteraction objPageInteraction = new IAOPageInteraction();
	
	public void assertEquals(WebDriver driver,String sDomType, String sUIReference,String sExpectedValue)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertEquals( objPageInteraction.byLinkText(driver, sUIReference).getText(),sExpectedValue);
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertEquals( objPageInteraction.byId(driver, sUIReference).getText(),sExpectedValue);
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertEquals( objPageInteraction.byclassName(driver, sUIReference).getText(),sExpectedValue);
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertEquals( objPageInteraction.byName(driver, sUIReference).getText(),sExpectedValue);
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertEquals( objPageInteraction.byXpath(driver, sUIReference).getText(),sExpectedValue);
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertEquals( objPageInteraction.byCSSPath(driver, sUIReference).getText(),sExpectedValue);
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
	
	public void assertTrue_isDisplayed(WebDriver driver,String sDomType, String sUIReference)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertTrue(objPageInteraction.isElementDisplayed(driver,By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertTrue(objPageInteraction.isElementDisplayed(driver,By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertTrue(objPageInteraction.isElementDisplayed(driver,By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertTrue(objPageInteraction.isElementDisplayed(driver,By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertTrue(objPageInteraction.isElementDisplayed(driver,By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertTrue(objPageInteraction.isElementDisplayed(driver,By.cssSelector(sUIReference)));
		}
	}
	
	public void assertTrue_isEnabled(WebDriver driver,String sDomType, String sUIReference)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertTrue(objPageInteraction.isElementEnabled(driver,By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertTrue(objPageInteraction.isElementEnabled(driver,By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertTrue(objPageInteraction.isElementEnabled(driver,By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertTrue(objPageInteraction.isElementEnabled(driver,By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertTrue(objPageInteraction.isElementEnabled(driver,By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertTrue(objPageInteraction.isElementEnabled(driver,By.cssSelector(sUIReference)));
		}
	}
	
	public void assertTrue_isSelected(WebDriver driver,String sDomType, String sUIReference)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertTrue(objPageInteraction.isElementSelected(driver,By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertTrue(objPageInteraction.isElementSelected(driver,By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertTrue(objPageInteraction.isElementSelected(driver,By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertTrue(objPageInteraction.isElementSelected(driver,By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertTrue(objPageInteraction.isElementSelected(driver,By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertTrue(objPageInteraction.isElementSelected(driver,By.cssSelector(sUIReference)));
		}
	}
	
	public void assertFalse_isDisplayed(WebDriver driver,String sDomType, String sUIReference)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertFalse(objPageInteraction.isElementDisplayed(driver,By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertFalse(objPageInteraction.isElementDisplayed(driver,By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertFalse(objPageInteraction.isElementDisplayed(driver,By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertFalse(objPageInteraction.isElementDisplayed(driver,By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertFalse(objPageInteraction.isElementDisplayed(driver,By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertFalse(objPageInteraction.isElementDisplayed(driver,By.cssSelector(sUIReference)));
		}
	}
	
	public void assertFalse_isEnabled(WebDriver driver,String sDomType, String sUIReference)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertFalse(objPageInteraction.isElementEnabled(driver,By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertFalse(objPageInteraction.isElementEnabled(driver,By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertFalse(objPageInteraction.isElementEnabled(driver,By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertFalse(objPageInteraction.isElementEnabled(driver,By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertFalse(objPageInteraction.isElementEnabled(driver,By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertFalse(objPageInteraction.isElementEnabled(driver,By.cssSelector(sUIReference)));
		}
	}
	
	public void assertFalse_isSelected(WebDriver driver,String sDomType, String sUIReference)
	{
		if(sDomType.equals("linkText"))
		{
			Assert.assertFalse(objPageInteraction.isElementSelected(driver,By.linkText(sUIReference)));
		}
		else if(sDomType.equals("id"))
		{
			Assert.assertFalse(objPageInteraction.isElementSelected(driver,By.id(sUIReference)));
		}
		else if(sDomType.equals("className"))
		{
			Assert.assertFalse(objPageInteraction.isElementSelected(driver,By.className(sUIReference)));
		}
		else if(sDomType.equals("name"))
		{
			Assert.assertFalse(objPageInteraction.isElementSelected(driver,By.name(sUIReference)));
		}
		else if(sDomType.equals("xpath"))
		{
			Assert.assertFalse(objPageInteraction.isElementSelected(driver,By.xpath(sUIReference)));
		}
		else if(sDomType.equals("cssSelector"))
		{
			Assert.assertFalse(objPageInteraction.isElementSelected(driver,By.cssSelector(sUIReference)));
		}
	}


}
