package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;

public class xxxxxx {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://mtouch.facebook.com/login/");
		 WebElement untb = driver.findElement(By.name("email"));
	 WebElement tntb = driver.findElement(By.name("pass"));
	 WebElement lntb = driver.findElement(By.name("login"));
		
		
		 //driver.navigate().refresh();
				 untb.sendKeys("ajeet1994cool@gmail.com");
				 tntb.sendKeys("qwerty@123");
				 lntb.click();
		 //driver.findElement(By.name("login")).click();
		 
		 
	
	
	
	
	}
	
	
	
	
}
