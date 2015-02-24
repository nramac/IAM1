package org.vukfactory.iamone.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author venmaum
 *		This class is a utility class for reading a Properties File 
 */
public class IAODataReader 
{
	FileInputStream proFileName;
	File sTempFile;
	String sValue;
	Properties objproperties = new Properties();

	/**
	 * This method is used to upload a properties file and basing on key value it returns a value from a properties file.
	 * @param sKey
	 * @return string
	 * @throws IOException
	 */
	public String getProperty(String sKey) throws IOException
	{
		proFileName = new FileInputStream("./config/IAMONE.properties");
		objproperties.load(proFileName);
		sValue = objproperties.getProperty(sKey);
		return sValue;
	}
}