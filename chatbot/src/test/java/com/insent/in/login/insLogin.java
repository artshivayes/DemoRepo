package com.insent.in.login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class insLogin 
{
  
	  WebDriver driver;
	  
		By email=By.name("email");
		By password=By.name("password");
		By submitbutton=By.xpath("/html/body/div[1]/div[3]/div[2]/form/button[1]");
		
		public  insLogin(WebDriver driver)
		{
			this.driver=driver;
			
		}
		public void logintoins(String uid, String pwd) throws InterruptedException
		{
			driver.findElement(email).clear();
			driver.findElement(email).sendKeys(uid);			
			driver.findElement(password).clear();
			driver.findElement(password).sendKeys(pwd);			
			driver.findElement(submitbutton).click();
			Thread.sleep(2000);
			
		}
		
		
		
		
		
  
}
