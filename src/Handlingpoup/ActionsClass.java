package Handlingpoup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		//To perform mouse hover actions
//		WebElement electornis = driver.findElement(By.xpath("//span[.='Electronics']"));
//		Thread.sleep(2000);
//		Actions ac=new Actions(driver);
//		Thread.sleep(2000);
//		ac.moveToElement(electornis).perform();
//	
	WebElement sss = driver.findElement(By.name("q"));
	Actions ac=new Actions(driver);
	ac.contextClick(sss).perform();
	
	
	
	
	
	
	
	}
	
	
	
}
