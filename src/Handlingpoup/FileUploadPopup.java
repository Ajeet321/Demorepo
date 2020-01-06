package Handlingpoup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/sandcube1/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("ajeetkumar.sandcube@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("UJULY8A9");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[1]")).click();
		
	}

}
