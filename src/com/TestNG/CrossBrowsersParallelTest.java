package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsersParallelTest {
	public static WebDriver driver;
	
 @Test
 @Parameters({"browser","url"})
 public void commoncheer(String browser,String url) {
	 if(browser.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	
	 }else if(browser.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriber.gecko.driver", "./drivers/geckodriver.exe");
		 driver=new FirefoxDriver();
	 }
		 
		 driver.get(url);
		 
	 }
 
 }


