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
	FileInputStream proFileIAO,proFileATO;
	File fIAMOneConfig,fIAOReportConfig;
	String srecorddir, screenshotdir, reportdir,atureportdir;
	Properties objProfIAO, objProfATO;
	
	public void setResultsPath(String sPaths) throws IOException
	{
		File fIAMOneConfig,fIAOReportConfig;
		objProfIAO = new Properties();
		fIAMOneConfig = new File("../config/IAMONE.properties"); 
		proFileIAO = new FileInputStream(fIAMOneConfig.getPath());
		objProfIAO.load(proFileIAO);
		
		if(objProfIAO.getProperty("IAMONE.recording.dir").equals(""))
		{
			objProfIAO.setProperty("IAMONE.recording.dir","../Reports/Video/"+sPaths+"/");
		}
		else
		{
			objProfIAO.setProperty("IAMONE.recording.dir","");
			objProfIAO.setProperty("IAMONE.recording.dir","../Reports/Video/"+sPaths+"/");
			
		}
		if(objProfIAO.getProperty("IAMONE.ScreenShot.dir").equals(""))
		{
			objProfIAO.setProperty("IAMONE.ScreenShot.dir","../Reports/Images/"+sPaths+"/");
		}
		else
		{
			objProfIAO.setProperty("IAMONE.ScreenShot.dir","");
			objProfIAO.setProperty("IAMONE.ScreenShot.dir","../Reports/Images/"+sPaths+"/");
			
		}
		if(objProfIAO.getProperty("IAMONE.Reports").equals(""))
		{
			objProfIAO.setProperty("IAMONE.Reports","../Reports/Html/"+sPaths+"/");
		}
		else
		{
			objProfIAO.setProperty("IAMONE.Reports","");
			objProfIAO.setProperty("IAMONE.Reports","../Reports/Html/"+sPaths+"/");
			
		}
		objProfIAO.store(new FileOutputStream(fIAMOneConfig), null);
		
		objProfATO = new Properties();
		fIAOReportConfig = new File("../config/atu.properties"); 
		proFileATO = new FileInputStream(fIAMOneConfig.getPath());
		objProfATO.load(proFileATO);
		if(objProfATO.getProperty("atu.reports.dir").equals(""))
		{
			objProfATO.setProperty("atu.reports.dir","../Reports/ATU Reports/"+sPaths+"/");
		}
		else
		{
			objProfATO.setProperty("atu.reports.dir","");
			objProfATO.setProperty("atu.reports.dir","../Reports/ATU Reports/"+sPaths+"/");
		}
		
		objProfATO.store(new FileOutputStream(fIAOReportConfig), null);
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