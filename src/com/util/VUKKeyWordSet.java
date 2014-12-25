package com.util;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

import org.openqa.selenium.WebDriver;

import com.eon.core.web.EONWebKeyWords;

public class VUKKeyWordSet  
{
	public VUKBaseKeyword objEBK = null;
	public EONWebKeyWords objEWKW = null;
	public VUKCustomizedKeyWord objVUKCK = null;
	public VUKFeatures objVUKFeatures = null;
	boolean methodExists = false;
	
	Method method = null;
	Class sclassName = null;
	public static WebDriver driverInstance;
	
		Class[] paramString = null;
		String [] sParamters = null;
	
		public void callMethods(String KeyWord,String Param1)
		{
			paramString = new Class[2];	
			paramString[0] = WebDriver.class;
			paramString[1] = String.class;
			
			sParamters = new String[1];
			sParamters[0] = Param1;
			
			method = invokeMethodWithParameters(KeyWord,paramString,sParamters);
			
		}
		public void callMethods(String KeyWord,String Param1, String Param2)
		{
			paramString = new Class[3];	
			sParamters = new String[2];
			
			if(!Param1.equals("") && !Param2.equals(""))
			{
				paramString[0] = WebDriver.class;
				paramString[1] = String.class;
				paramString[2] = String.class;
				
				sParamters[0] = Param1;
				sParamters[1] = Param2;
			}
			else if(Param1.equals(""))
			{
				paramString[0] = WebDriver.class;
				paramString[1] = String.class;
				
				sParamters[1] = Param1;
			}
			
			else if(Param2.equals(""))
			{
				paramString = new Class[2];	
				sParamters = new String[1];
				sParamters[0] =Param1;
				paramString[0] = WebDriver.class;
				paramString[1] = String.class;
				
			}
			else
			{
				paramString = null;
				sParamters = null;
			}
			invokeMethodWithParameters(KeyWord,paramString,sParamters);
		}
		public void callMethods(String KeyWord,String Param1, String Param2, String Param3)
		{
			paramString = new Class[4];	
			paramString[0] = WebDriver.class;
			paramString[1] = String.class;
			paramString[2] = String.class;
			paramString[4] = String.class;
			
			sParamters = new String[3];
			sParamters[0] = Param1;
			sParamters[2] = Param2;
			sParamters[3] = Param3;
			
			invokeMethodWithParameters(KeyWord,paramString,sParamters);
		}
		
		public Class checkMethodAndgetClassName(String methodName)
		{
			 List al = new ArrayList();
			 objEBK = new VUKBaseKeyword();
			 objVUKCK = new  VUKCustomizedKeyWord();
			 objVUKFeatures = new VUKFeatures();
			 try {
				String sKeywordObject = objVUKCK.getProperty("Custom.KeyWord");
				StringTokenizer st = new StringTokenizer(sKeywordObject,",");
				Class sCustomKeyWordClass;
				Object oCustomKeyWordObject;
				
				while (st.hasMoreElements()) {
					sCustomKeyWordClass = Class.forName(st.nextElement().toString());
					oCustomKeyWordObject= sCustomKeyWordClass.newInstance();
					al.add(oCustomKeyWordObject);
				}
					
				 al.add(objEBK);
				 al.add(objVUKFeatures);
				 
				 for(int i=0;i<al.size();i++)
				 {
					 Class sObject = al.get(i).getClass();
					
						 for (Method method : sObject.getDeclaredMethods()) {
				                if (method.getName().equals(methodName)) {
				                	
				                	sclassName = sObject;
				                	break;
				            }
						 }
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			return sclassName;
		}
	public Method invokeMethodWithParameters(String KeyWord,Class[] paramString,String []sParams)
	{
		Class sClassName;
		Object cObject;
		try
		{
			sClassName = Class.forName(checkMethodAndgetClassName(KeyWord).getName());
			cObject= sClassName.newInstance();
			
			if(sParams == null && paramString == null)
			{
				method = sClassName.getDeclaredMethod(KeyWord);
				method.invoke(cObject);
			}
			else
			{
				if(KeyWord.contains("Browser") && KeyWord.equalsIgnoreCase("setBrowser"))
				{
					Class sChangeParamString = paramString[1];
					method = sClassName.getDeclaredMethod(KeyWord, sChangeParamString);
					driverInstance = (WebDriver) method.invoke(cObject,sParams);
				}
				else
				{
					Object [] sParamtersNew = new Object[sParams.length+1];
					method = sClassName.getDeclaredMethod(KeyWord,paramString);
					for(int j=0;j<sParams.length;j++)
					{
						sParamtersNew[j-j] =driverInstance;
						sParamtersNew[j+1]=sParams[j];
					}
					method.invoke(cObject,sParamtersNew);
				}
				
			}
		}
		catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return method;
	}
}
