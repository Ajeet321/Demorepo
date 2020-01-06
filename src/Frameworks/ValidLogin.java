package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
public static void main(String[] args) throws Throwable {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://online.actitime.com/sandcube1/");
	 String path="./data/input.xlsx";
	 GenericExcelhandling gen = new GenericExcelhandling();
	 String username = gen.getCellData(path, "valid", 1, 0);
	 String password = gen.getCellData(path, "valid", 1, 1);
	 driver.findElement(By.name("username")).sendKeys(username);
	 driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	String ttt = driver.getTitle();
	System.out.println(ttt);
	if(ttt.equals("actiTIME - Login"))
	{
		
		System.out.println("this is login in");
		
	}else {
		
		System.out.println("nikal lo");
	}

	 
	 
	 
//	 int rc = gen.getRowCount("invalid", path);
//for(int i=1;i<=rc;i++)
//{
//	String username = gen.getCellData(path, "invalid", i, 0);
//	String password = gen.getCellData(path, "invalid", i, 1);
//	Thread.sleep(2000);
//	WebElement untb = driver.findElement(By.name("username"));
//	Thread.sleep(2000);
//	untb.sendKeys(username);
//	Thread.sleep(2000);
//	driver.findElement(By.name("pwd")).sendKeys(password);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[.='Login ']")).click();
//	untb.clear();
//String Title = driver.getTitle();
//if(Title.equals("actiTIME - Login"))
//{
//gen.setCellData(path, "invalid", i, 2, "pass");	
//
//}else
//{
//gen.setCellData(path, "invalid", i, 2, "Fail");	
//}
//}
}
}
