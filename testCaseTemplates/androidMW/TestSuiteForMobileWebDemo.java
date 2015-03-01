import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import org.vukfactory.iamone.basic.IAOBasicFunctions;
import org.vukfactory.iamone.driver.IAODrivers;
import org.vukfactory.iamone.feature.IAOReports;


/**
 * @author venmaum
 *  
 */
public class TestSuiteForMobileWebDemo {
	
	IAODrivers objDriver = new IAODrivers();
	IAOReports objReport = new  IAOReports();
	IAOBasicFunctions objBasic = new IAOBasicFunctions();
	
	WebDriver driver = null;
	
	@BeforeClass(groups = {"setUp"})
	@Parameters({"AppEnvironment","DBEnvironment","AppiumRunningAt","MobileVersion","MobileID"})
	public void setUpEnvironment(String sAppEnvironment, String sDBEnvironment,String sAppiumServerRunningAt,String sMobileID, String sMobileVersion) throws IOException
	{
		//objReport.startRecorder();
		driver = objDriver.setAndroidBrowser(sMobileID,sMobileVersion,sAppiumServerRunningAt);
		objReport.writeTestReports(driver);
		objBasic.openUrlInBrowser(driver, "Url to Invoke");
		//Setting applciation url ready for testing
	}
	
	@Test(priority=21, alwaysRun=true,  successPercentage =100)
	public void test_1_TestCase1() 
	{
		
	}
	
	@AfterClass(groups = {"tearDown"})
	public void tearDown() {
		objDriver.closeDriver(driver);
		
	}
}
