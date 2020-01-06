package Frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodDriven {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://mtouch.facebook.com/login/");
	 ActiPOM ap=new ActiPOM(driver);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 ap.setuntb("admin");
	 ap.getuntb().clear();

	 Thread.sleep(2000);
ap.settntb("password");
Thread.sleep(2000);
ap.setlntb();
	 
	 
	 
	 
}
}
