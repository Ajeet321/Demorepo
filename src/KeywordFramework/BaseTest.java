package KeywordFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	public static WebDriver driver;
	public void openBrower() throws Throwable
	{
		
		Filelib flib=new Filelib();
		String browservlaue=flib.getKeyPropvalue(PROP_PATH , "browser");
		if(browservlaue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			
		}else if(browservlaue.equals("mozilla")){
			
			
			
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		String url = flib.getKeyPropvalue(PROP_PATH, "url");
		driver.get(url);
		}
	
	public void closeBrower() {
		
		driver.quit();
	}
	
}
