package com.insent.in.LoginValidation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.insent.in.driver.insWebDriver;
import com.insent.in.login.insLogin;

public class insLoginVerify 
{
	
	 static int i=0;
	 private static WebDriver driver=null;
	 static
		{
		
			driver = new insWebDriver().getDriverInstance();
		}

	
	 
  @Test
  public void Loginvalidation() throws InterruptedException 
  {
	  
	  System.out.println("insent Login started");
	 // driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  	//WebDriver driver=new FirefoxDriver();
	  	driver.manage().window().maximize();
	  	//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  //	driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		
	  	String expectedPageURL="https://insentrecruitment1.insent.ai/login?redirectUrl=%2Fconversations";
	  	
	  	driver.get(expectedPageURL);
	  	
	  	//if(driver.getPageSource().contains("Sign in with your email and get access"))
	  //	{
	  //		System.out.println("Text is present");
	  //	}
	  //	else
	  //	{
	  //		System.out.println("Text is absent");
	  	//}
	  
		Thread.sleep(3000);
		//takescreenshot();			
		System.out.println("The  title is:" +driver.getTitle());		
		//takescreenshot();
		Thread.sleep(2000);
		insLogin login=new insLogin(driver);
		System.out.println(" logged step 1");
		Thread.sleep(2000);
	   
		login.logintoins("artshivayes@gmail.com","789456123");	
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		System.out.println(" logged input provided");
		//takescreenshot();   		
	    System.out.println(" logged in");
	    
	   
  }

public static void takescreenshot()
{
	 try 
	    {
	    TakesScreenshot ts=(TakesScreenshot)driver;
	     
	    File source=ts.getScreenshotAs(OutputType.FILE);
	     
	    FileUtils.copyFile(source, new File("ScreenShots\\Login"+i+".png"));
	     
	    System.out.println("Login"+i+"taken");
	    i++;
	    } 
	    catch (Exception e)
	    {
	    takescreenshot();
	    System.out.println("Exception while taking screenshot "+e.getMessage());
	    takescreenshot();
	    } 
}

}
