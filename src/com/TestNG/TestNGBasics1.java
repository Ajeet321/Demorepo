package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics1 {

	@BeforeSuite
	public void setup() {
		System.out.println("@Before suite---setup system property");
		
	}
	@BeforeTest
	public void launchBrowers() {
		System.out.println("@Before Test---launch the browesers");
	}
	@BeforeClass
	public void login() {
		
		System.out.println("@Before class---login to the browerses");
	
	}
	@BeforeMethod
	
		public void enterURL() {
		System.out.println("@Before method---enter the url");
		
		}
		
	@Test
public void googleTitleTest() {
		System.out.println("@test---- googleTitleTest");
	
	}	
	@Test
	public void serchTest() {
		
		System.out.println("@test---- SearchTitleTest");
		
	}
	@AfterMethod
	
	public void logout() {
	System.out.println("@After method---logout the url");
	
	}@AfterClass
	public void closeTheBrowesr() {
		System.out.println("close the browesers");
	}
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("deleteAllCookies");
		
	}
	
}
