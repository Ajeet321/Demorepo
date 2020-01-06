package Frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPOM {
//Decleartion
	@FindBy(name="email")private WebElement untb; 
	public WebElement getuntb()
	{
		return untb;
	}
	public void setuntb(String un)
	{
		untb.sendKeys(un);
	}
	@FindBy(name="pass")private WebElement tntb;
	public WebElement gettntb()
	{
		return tntb;
	}
	public void settntb(String pwd)
	{
		untb.sendKeys(pwd);
	}

	@FindBy(name="login")private WebElement lntb;
	public WebElement getlntb()
	{
		return lntb;
	}
	public void setlntb()
	{
		lntb.click();
	}
	
	public ActiPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public void login(String un,String pwd)
{
	
untb.sendKeys(un);
tntb.sendKeys(pwd);
lntb.click();

}


}

