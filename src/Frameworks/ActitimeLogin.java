package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://online.actitime.com/sandcube1/");
 String path="./data/input.xlsx";
 GenericExcelhandling gen = new GenericExcelhandling();
String loginid = gen.getCellData(path, "valid", 1, 0);
System.out.println(loginid);



}
}
