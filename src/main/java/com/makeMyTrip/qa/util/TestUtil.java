package com.makeMyTrip.qa.util;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.makeMyTrip.qa.base.TestBase;


public class TestUtil extends TestBase {
	
	
	public static long Page_Load_TimeOut=20;
	public static long IMPLICIT_WAIT=10;
	
    public void closePopUp()
    {
    	driver.switchTo().frame("notification-frame-~19714b447");
    	WebElement popUp = driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-container']"));
		if(popUp.isDisplayed())
    	{
			driver.findElement(By.xpath(RepositeriesFactory.close)).click();
    	}
		//driver.switchTo().defaultContent();
    }
	      //driver.switchTo().alert().dismiss();
          //driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
   /* try {
    	
    	WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
    	
    	wait.Until(ExpectedConditions.alertIsPresent());
    	
    	try {
    	
    	driver.switchTo().alert().accept();
    	
    	} catch (NoAlertPresentException e) {
    	
    	System.out.println(“An exceptional case”);
    	
    	}
    	
    	} catch (TimeOutException e)
    	
    	System.out.println(“WebDriver couldn’t locate the Alert”);
    	
    	}*/


}
