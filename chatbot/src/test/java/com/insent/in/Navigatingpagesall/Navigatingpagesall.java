package com.insent.in.Navigatingpagesall;

import org.testng.annotations.Test;

import com.insent.in.driver.insWebDriver;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Navigatingpagesall 
{
	static WebDriver driver;
	 static
		{
		
			driver = new insWebDriver().getDriverInstance();
		}	 
	 
	 @Test
	 public void Navigatingpagesall()
	 {
	try 
	{
		 Thread.sleep(3000);
		 //Conversations 
		 
		 driver.findElement(By.xpath("//*[@id='toggle-zIndex']/div/div[1]/div[3]/div/div/div/div/div/a/img")).click();
		 Thread.sleep(3000);
		 
		 //Create Conversations 
		 
		 
		 driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div/div/div[1]/div[2]/div/div/button")).click();
		 Thread.sleep(3000);
		
		 
		 driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div/div/div/form/div[1]/div/div[2]/div[1]/input")).sendKeys("test01");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div/div/div/form/div[3]/div/div[3]/button/span/span")).click();
		 Thread.sleep(3000);
		 
		 //Conversations flow 
		 driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div/div/div[2]/div/div[2]")).click();
		 Thread.sleep(3000);
		 //Personalisation token for First Name and Last Name
		 
//		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/div")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div")).click();
//		 Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//*[@id='formContent']/div[1]/div[2]/div/div/div")).click();
//		 Thread.sleep(3000);
		 
		// WebElement MyElement = driver.findElement(By.xpath("//*[@id='formContent']/div[1]/div[2]/div/div/div/div[1]/div[1]"));
		 //MyElement.sendKeys("First Name"+Keys.ENTER);
		 //MyElement.sendKeys(Keys.ENTER);
		 
		 //driver.findElement(By.xpath("//*[@id='formContent']/div[1]/div[2]/div/div/div/div[1]/div[1]")).sendKeys("First Name"+Keys.ENTER);
//		 WebElement MyElement = driver.findElement(By.xpath("//*[@id='formContent']/div[1]/div[2]/div/div/div/div[1]/div[1]"));
//		 MyElement.getText();
//		 System.out.println(MyElement);

		//WebElement selectMyElement = driver.findElement(this.getObject(By.xpath("//div[@id='react-select-2-option-1']")));
		//System.out.println("to print value selectMyElement" + selectMyElement);
		//selectMyElement.click();
		
		//Actions keyDown = new Actions(driver);
		//keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		 
		 //Select fn = new Select(driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div/form/div/div[1]/div[2]/div/div/div/div[1]/div[1]")));
		 //fn.selectByValue("First Name");
		 
		//driver.findElement(By.xpath("//*[@id='formContent']/div[1]/div[2]/div/div/div/div[1]/div[1]")).sendKeys("First Name");
//		driver.findElement(By.xpath("//*[@id='formContent']/div[2]/div[2]/div/input")).sendKeys("Shiva");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id='formContent']/div[3]/button[2]/span/span")).click();
//		Thread.sleep(3000);
		
		
		// driver.findElement(By.xpath("//*[@id='formContent']/div[1]/div[2]/div/div/div/div[1]/div[1]")).click();
		
		
		 
		
		 //Last name
		
	//	driver.findElement(By.xpath("//*[@id='formContent']/div[1]/div[2]/div/div/div")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[@id='formContent']/div[1]/div[2]/div/div/div/div[1]/div[1]")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[@id='formContent']/div[2]/div[2]/div/input")).sendKeys("S");
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[@id='formContent']/div[3]/button[2]/span/span")).click();
	//	Thread.sleep(3000);
		
		
		//Hello, how can I help you
		
		driver.findElement(By.xpath("//*[@id='AddNewStepButton']/span/span[1]/div")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"addNewStepPopup\"]/div/div[4]/div/div/div")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Message')]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id='addNewStepPopup']/div/div[4]/div/div/div/div/svg")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Show a message')]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/p")).clear();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/p")).sendKeys("Hello, how can I help you?");
		Thread.sleep(3000);
	 
		//Can I get your email
		
				driver.findElement(By.xpath("//*[@id='AddNewStepButton']/span/span[1]/div")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"addNewStepPopup\"]/div/div[4]/div/div/div")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[contains(text(),'Message')]")).click();
				Thread.sleep(3000);
				
				//driver.findElement(By.xpath("//*[@id='addNewStepPopup']/div/div[4]/div/div/div/div/svg")).click();
				//Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[contains(text(),'Show a message')]")).click();
				Thread.sleep(3000);
				
				//driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/p")).clear();
				//Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[3]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/p")).sendKeys("Can I get your email?");
				Thread.sleep(3000);
		
				//Data Capture
				
				driver.findElement(By.xpath("//*[@id='AddNewStepButton']/span/span[1]/div")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"addNewStepPopup\"]/div/div[2]/div/div/div/div")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[contains(text(),'Data Capture')]")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[contains(text(),'User data capture')]")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[contains(text(),'Select or type to create a new field')]")).click();
				Thread.sleep(3000);
				
				//driver.findElement(By.xpath("//div[contains(@class,'css-1uccc91-singleValue')]")).click();
				driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div/div/div[3]/div/form/div/div[2]/div/div[2]/div[2]/div[3]/div/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div/div/div/div[1]/div[1]")).click();
				Thread.sleep(3000);
				
			
		
	} 
	
	
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

	private By getObject(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}
}
