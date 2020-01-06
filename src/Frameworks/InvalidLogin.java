package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://online.actitime.com/sandcube1/");
	 String path="./data/input.xlsx";
	 GenericExcelhandling gen = new GenericExcelhandling();
	 int rc = gen.getRowCount("invalid", path);
	 System.out.println(rc);
	 for(int i=1;i<=rc;i++)
	 {
		 String username = gen.getCellData(path, "Invalid", i, 0);
		 Thread.sleep(2000);
		 String password = gen.getCellData(path, "Invalid", i, 1);
		 Thread.sleep(2000);
		 WebElement untb = driver.findElement(By.name("username"));
		 untb.sendKeys(username);
		 Thread.sleep(2000);

		 driver.findElement(By.name("pwd")).sendKeys(password);
		 Thread.sleep(2000);

		driver.findElement(By.xpath("//div[.='Login ']")).click();	
	String title = driver.getTitle();
	if(title.equals("actiTIME - Login"))
	{
		gen.setCellData(path, "Invalid", i, 2, "pass");
		
	}
	else {
		
		gen.setCellData(path, "Invalid", i, 2, "fail");
	}
	 }
}
}
