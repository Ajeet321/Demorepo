package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		//Thread.sleep(3000);	
	}
@Test(priority=1,groups="title")
		public void googleTitleTest() {
			
			String title=driver.getTitle();
			System.out.println(title);
		
		}
		
@Test(priority=2,groups="logo")
public void googleLogoTest() {
	
	 boolean b1=driver.findElement(By.id("hplogo")).isDisplayed();
	 System.out.println(b1);
	
}
@Test(priority=3,groups="link")
public void mailLinkTest() {
	
	boolean b=driver.findElement(By.xpath("//a[.='Gmail']")).isDisplayed();
	System.out.println(b);
	
}
@Test(priority=4,groups="test")
public void test1() {
	
	System.out.println("test1");
	
}
@Test(priority=5,groups="test")
public void test2() {
	
	System.out.println("test2");
}
@Test(priority=6,groups="test")
public void test3() {
	
	System.out.println("test3");
	
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	
	}
	}


