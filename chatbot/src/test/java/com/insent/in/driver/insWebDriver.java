package com.insent.in.driver;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class insWebDriver 
{
	
	private static WebDriver driver=null;
	public static String chdriver;
	
	
	
	
	
	public insWebDriver()
	{
		
	}
	public WebDriver getDriverInstance() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\TIERONE\\Automation\\Workspace\\chatbot\\Drivers");
	
		
		if(driver==null)
		{
			System.out.println("Driver invoke action");
			
		System.setProperty("webdriver.chrome.driver","D:\\TIERONE\\Automation\\Workspace\\chatbot\\Drivers\\chromedriver.exe");		
				
			//System.setProperty("webdriver.chrome.driver",com.ahyush.in.config.AhyConfig.chdriver);
	
			driver = new ChromeDriver();
			//Thread.sleep(3000);
			//driver = new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
			
		}
		return driver;
	}
}
