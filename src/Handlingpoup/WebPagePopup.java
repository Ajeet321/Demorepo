package Handlingpoup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebPagePopup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.flipkart.com/");
//	Thread.sleep(2000);
//	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//button[.='✕']")).click();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://www.cleartrip.com/");
}
}
