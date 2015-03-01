import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import org.vukfactory.iamone.driver.IAODrivers;
import org.vukfactory.iamone.feature.IAOReports;

/**
 * @author venmaum
 *  
 */
public class TestSuiteForAndroidAppDemo {
	
	IAODrivers objDriver = new IAODrivers();
	IAOReports objReports = new IAOReports();
	
	
	AndroidDriver driver = null;
	
	@BeforeClass(groups = { "setUp"})
	@Parameters({"AppEnvironment","DBEnvironment","MobileID","MobileVersion","AppPath","PacKageName","ActivityName","AppiumRunningAt"})
	public void setUpEnvironment(String sAppEnvironment, String sDBEnvironment, String MobileID,String MobileVersion,String AppPath, String PacKageName,String ActivityName,
			String AppiumRunningAt) throws IOException
	{
		objReports.writeTestReports(driver);
		driver = objDriver.setAndroidApp(MobileID, MobileVersion, AppPath, PacKageName, ActivityName, AppiumRunningAt);
		//Setting applciation url ready for testing
	}
	
	@Test(priority=0, alwaysRun=true, successPercentage =100)
	public void test_TestCase1() 
	{
		Reporter.log("");
		
	}
	@AfterClass(groups = {"tearDown"})
	public void tearDown() {
		objDriver.closeDriver(driver);
	}
}
