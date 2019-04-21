package com.makeMyTrip.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.makeMyTrip.qa.base.TestBase;
import com.makeMyTrip.qa.pages.HomePage;
import com.makeMyTrip.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	
	HomePage homepage;
	TestUtil testutil;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		testutil=new TestUtil();
		homepage=new HomePage();
	}
	@Test
	public void tripPlanerTest()
	{
		homepage.tripPlaner();
	}
	
}
