package org.vukfactory.iamone.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author venmaum
 *		This class is a utility class for wiritn the reports path to the Properties File 
 */
public class IAOsetResultPath 
{
	FileInputStream proFileName;
	File fIAMOneConfig,fIAOReportConfig;
	Properties objproperties = new Properties();
	
	public void setResultsPath(String sPaths) throws IOException
	{
		File fIAMOneConfig,fIAOReportConfig;
		
		fIAMOneConfig = new File("../config/IAMONE.properties"); 
		proFileName = new FileInputStream(fIAMOneConfig.getPath());
		objproperties.load(proFileName);
		
		objproperties.setProperty("IAMONE.recording.dir",objproperties.getProperty("IAMONE.recording.dir")+sPaths+"/");
		objproperties.setProperty("IAMONE.ScreenShot.dir",objproperties.getProperty("IAMONE.ScreenShot.dir")+sPaths+"/");
		objproperties.setProperty("IAMONE.ScreenShot.dir",objproperties.getProperty("IAMONE.Reports")+sPaths+"/");
		
		fIAOReportConfig = new File("../config/atu.properties"); 
		proFileName = new FileInputStream(fIAMOneConfig.getPath());
		objproperties.load(proFileName);
		objproperties.setProperty("atu.reports.dir",objproperties.getProperty("atu.reports.dir")+sPaths+"/");
		
		objproperties.store(new FileOutputStream(fIAMOneConfig), null);
		objproperties.store(new FileOutputStream(fIAOReportConfig), null);
	}
	public static void main(String []args)
	{
		IAOsetResultPath objsetPath = new IAOsetResultPath();
		try {
			objsetPath.setResultsPath(args[0]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}