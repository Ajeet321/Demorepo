package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
@Test(priority=1,invocationCount=10)
	public void moon() {
		
		Reporter.log("admin",true);		
	}
@Test(priority=2,enabled=true)
public void run()
{
Reporter.log("i am method run method of demo class",true);	

}
@Test(priority=2,enabled=false)
public void bun() {
	
	Reporter.log("i am bun method of demo1 class",true);
	
}
@Test(priority=3)
public void gun() 
{
	Reporter.log("i am gun method of demo1 class",true);
	
}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

