package com.makeMyTrip.qa.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.makeMyTrip.qa.base.TestBase;
import com.makeMyTrip.qa.util.RepositeriesFactory;
import com.makeMyTrip.qa.util.TestUtil;

public class HomePage extends TestBase{
Properties prop;
TestUtil testutil;
	public void tripPlaner() {
		try {
			driver.findElement(By.xpath(RepositeriesFactory.from)).click();
			driver.findElement(By.xpath(RepositeriesFactory.DepartCityName)).sendKeys(prop.getProperty("departureCity"));
			List<WebElement> list = driver.findElements(By.xpath(RepositeriesFactory.autosearchList));
			list.get(0).click();
			testutil.closePopUp();

		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("popUp not found");

		}

	}
	
}
