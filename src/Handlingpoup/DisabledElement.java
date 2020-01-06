package Handlingpoup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/AjeetK/Desktop/disabled.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
		WebElement pwtb = driver.findElement(By.id("i2"));
		if(pwtb.isEnabled()) {
			
			System.out.println("it is enabled");
			driver.findElement(By.id("i2")).sendKeys("pass");
		}else {
			
			System.out.println("it is disabled");
			
		}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('i2').value='manager'");
	}
	
}
