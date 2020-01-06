package Handlingpoup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadPopup {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
	driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	}

}
