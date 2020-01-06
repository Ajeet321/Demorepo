package KeywordFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class KeywordMainClass {
	public static void main(String[] args) throws Throwable {
		
	
	FileInputStream fis=new FileInputStream("./data/config.properties");
	Properties propvlaue = new Properties();
	propvlaue.load(fis);
	String vlaue = propvlaue.getProperty("browser");
	System.out.println(vlaue);
	
	}

}
