import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import org.vukfactory.iamone.driver.IAODrivers;
import org.vukfactory.iamone.feature.IAOReports;


public class TestSuiteForIAOAndroidApp {
	
	//Intialize the KeyWord Class
	
	//Intialize the Common Class for Both Web and Mobile
	IAODrivers objDriver = new IAODrivers();
	IAOReports objReports = new IAOReports();
	
	AndroidDriver driver = null;
	
	
	@BeforeClass(groups = { "setUp"})
	@Parameters({"AppEnvironment","DBEnvironment","MobileID","MobileVersion","AppPath","PacKageName","ActivityName","AppiumRunningAt"})
	public void setUpEnvironment(String sAppEnvironment, String sDBEnvironment, String MobileID,String MobileVersion,String AppPath, String PacKageName,String ActivityName,
			String AppiumRunningAt) throws IOException
	{
		objReports.writeTestReports();
		objDriver.setAndroidApp(MobileID, MobileVersion, AppPath, PacKageName, ActivityName, AppiumRunningAt);
	}
	
	@Test(priority=0, alwaysRun=true, groups = { "",""}, successPercentage =100)
	public void testCase1() 
	{
		//Write your test script
	}
	
	@AfterClass
	public void tearDown() {
		objDriver.closeDriver(driver);
	}
}
