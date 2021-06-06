package com.insent.in.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class InsConfig {
	
	public static String  outputfile;
	public static String  chdriver;
	public static String userName;
	public static String passWord;

	static {
		
		Properties props=new Properties();
		try {
			InputStream propertystream = new FileInputStream("configuration.properties");
			props.load(propertystream);
			
			System.out.println("output file path"+props.getProperty("OutputFilePath"));
			outputfile=System.getProperty("user.home")+props.getProperty("Outputfile");
			
					
			chdriver = System.getProperty("user.dir") +props.getProperty("driverpath");
			
			System.out.println("driverpath"+chdriver);
			userName = System.getProperty("user.dir") +props.getProperty("username");
			passWord = System.getProperty("user.dir") +props.getProperty("password");
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
