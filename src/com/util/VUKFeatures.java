package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.testng.Reporter;

import com.util.VUKKeyWordSet;

public class VUKFeatures extends VUKKeyWordSet
{
	public void takeScreenShot(WebDriver driver, String snapshotName)
	{
		File objScreenCaptureFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//Storing the image in the local system.
		try {
			FileUtils.copyFile(objScreenCaptureFile ,new File("./images/"+snapshotName+".png"));
			// Reporter.log("<br> <img src="+"../../images/" + new File(snapshotName+".png")  + " /> <br>");
			 Reporter.log("<td><a href='../../images/"+snapshotName+".png'><img src='../../images/"+snapshotName+".png' height='100' width='100' /></a></td>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
	
	
}
