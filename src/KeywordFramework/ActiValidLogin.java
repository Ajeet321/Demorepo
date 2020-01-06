package KeywordFramework;

import org.openqa.selenium.By;

public class ActiValidLogin extends BaseTest{
public static void main(String[] args) throws Throwable {
BaseTest bt=new BaseTest();
bt.openBrower();
Filelib flib=new Filelib();
String un = flib.getKeyPropvalue(PROP_PATH, "username");
String pass = flib.getKeyPropvalue(PROP_PATH, "password");
driver.findElement(By.name("username")).sendKeys(un);
driver.findElement(By.name("pwd")).sendKeys(pass);
driver.findElement(By.xpath("//div[.='Login ']")).click();



}
}
