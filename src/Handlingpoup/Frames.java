package Handlingpoup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/AjeetK/Desktop/frames.html");
	driver.findElement(By.id("user")).sendKeys("hflkejf");
	driver.switchTo().frame(0);
	driver.findElement(By.id("pass")).sendKeys("wwww");
	driver.switchTo().defaultContent();
	
	
	}
	
	
	
}
