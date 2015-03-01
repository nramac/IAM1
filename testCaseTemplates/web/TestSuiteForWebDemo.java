import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import org.testng.annotations.DataProvider; // Not being used currently

import org.vukfactory.iamone.basic.IAOBasicFunctions;
import org.vukfactory.iamone.driver.IAODrivers;
import org.vukfactory.iamone.feature.IAOReports;
import org.vukfactory.iamone.ui.IAOPageInteraction;
import org.vukfactory.iamone.ui.IAOPageWaits;
import org.vukfactory.iamone.ui.IAOUIAssert;


public class TestCaseForWebDemo {
	
	
	WebDriver driver;
	
	
	IAODrivers objDriver = new IAODrivers();
	IAOReports objReport = new  IAOReports();
	IAOBasicFunctions objbasic = new IAOBasicFunctions();
	IAOPageInteraction objPageInteract = new IAOPageInteraction();
	IAOUIAssert objAssert = new IAOUIAssert();
	IAOPageWaits objwait = new IAOPageWaits();
	
	
	@BeforeClass(groups = {"setUp"})
	@Parameters({"AppEnvironment","DBEnvironment","browser"})
	public void setUpEnvironment(String sAppEnvironment, String sDBEnvironment,String sBrowser) throws IOException
	{
		driver = objDriver.setFirefoxBrowser();
		objReport.writeTestReports(driver);
		objReport.startRecorder();
		try {
			objbasic.clearCookies(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objbasic.openUrlInBrowser(driver, "URL to Invoke");
	}
	
   @Test(priority=0, alwaysRun=true, successPercentage =100)
	public void test_1_TestCase1()
	{
	  
	
   @AfterClass(groups = {"tearDown"})
	public void tearDown()
	{
	   objDriver.closeDriver(driver);
	   objReport.stopRecorder();
	}
}
