package org.vukfactory.iamone.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IAODOMReader
{
	
	public WebElement setclassName(WebDriver driver, String sClassId)
	{
		return driver.findElement(By.className(sClassId));
	}
	
	public WebElement setName(WebDriver driver, String sNameId)
	{
		return driver.findElement(By.name(sNameId));
	}
	
	public WebElement setLinkText(WebDriver driver, String sLinkText)
	{
		return driver.findElement(By.linkText(sLinkText));
	}
	
	public WebElement setXpath(WebDriver driver,String sXpathString)
	{
		return driver.findElement(By.xpath(sXpathString));
	}
	
	public WebElement setCSSPath(WebDriver driver,String sCssSelector)
	{
		return driver.findElement(By.cssSelector(sCssSelector));
	}
	
	public WebElement setID(WebDriver driver,String sId)
	{
		return driver.findElement(By.id(sId));
	}
}
