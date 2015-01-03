package com.util;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.openqa.selenium.WebDriver;


public class VUKKeyWordSet  
{
	public VUKBaseKeyword objEBK = null;
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
				
				sParamters[0] = Param2;
			}
			
			else if(Param2.equals(""))
			{
				paramString = new Class[2];	
				sParamters = new String[1];
			
				paramString[0] = WebDriver.class;
				paramString[1] = String.class;
				sParamters[0] =Param1;
				
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
			if(!Param1.equals("") && !Param2.equals("") && !Param3.equals(""))
			{
				paramString = new Class[4];	
				sParamters = new String[3];
				
				paramString[0] = WebDriver.class;
				paramString[1] = String.class;
				paramString[2] = String.class;
				paramString[3] = String.class;
				
				sParamters[0] = Param1;
				sParamters[1] = Param2;
				sParamters[2] = Param3;
			}
			
			else if((!Param1.equals("") && Param2.equals("") && Param3.equals("")) ||(!Param2.equals("") && Param1.equals("") && Param3.equals(""))||
					(!Param3.equals("") && Param1.equals("") && Param2.equals("")))
			{
				paramString = new Class[2];	
				sParamters = new String[1];
				paramString[0] = WebDriver.class;
				paramString[1] = String.class;
				 if (!Param1.equals(""))
				 {
					 sParamters[0] = Param1;
				 }
				 else if (!Param2.equals(""))
				 {
					 sParamters[0] = Param2;
				 }
				 else if (!Param3.equals(""))
				 {
					 sParamters[0] = Param3;
				 }
				
			}
			
			else if ((Param1.equals("") && !Param2.equals("") && !Param3.equals("")) || (Param2.equals("")&& !Param1.equals("") && !Param3.equals(""))||
					(Param3.equals("")&& !Param1.equals("") && !Param2.equals("")))
			{
				paramString = new Class[3];	
				sParamters = new String[2];
				
				paramString[0] = WebDriver.class;
				paramString[1] = String.class;
				paramString[2] = String.class;
				
				if (Param1.equals(""))
				{
					sParamters[0] = Param2;
					sParamters[1] = Param3;
				}
				else if (Param2.equals(""))
				{
					sParamters[0] = Param1;
					sParamters[1] = Param3;
				}
				else if (Param3.equals(""))
				{
					sParamters[0] = Param1;
					sParamters[1] = Param2;
				}
			}
			else
			{
				paramString = null;
				sParamters = null;
			}
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
			
				if(KeyWord.contains("Browser") && KeyWord.equalsIgnoreCase("setBrowser"))
				{
					if(sParams[0].contains("android") && sParams[0].equalsIgnoreCase("android"))
					{
						Class []sChangeParamString = new Class[3];
						sChangeParamString[0]= paramString[1];
						sChangeParamString[1]= paramString[2];
						sChangeParamString[2]= paramString[3];
						method = sClassName.getDeclaredMethod(KeyWord, sChangeParamString);
						driverInstance = (WebDriver) method.invoke(cObject,sParams);
					}
					else if(sParams[0].contains("chrome") && sParams[0].equalsIgnoreCase("chrome"))
					{
						Class []sChangeParamString = new Class[3];
						sChangeParamString[0]= paramString[1];
						sChangeParamString[1]= paramString[2];
						sChangeParamString[2]= paramString[3];
						method = sClassName.getDeclaredMethod(KeyWord, sChangeParamString);
						driverInstance = (WebDriver) method.invoke(cObject,sParams);
					}
					else
					{
						System.out.println("do nothing");
					}
					
				}
				else
				{
					if(sParams == null || paramString == null)
					{
						Class []sChangeParamString = new Class[1];
						sChangeParamString[0]= WebDriver.class;
						Object [] sParamtersNew = new Object[1];
						sParamtersNew[0] = driverInstance;
						method = sClassName.getDeclaredMethod(KeyWord,sChangeParamString);
						method.invoke(cObject,sParamtersNew);
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
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return method;
	}
}
