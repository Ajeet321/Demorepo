package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void run() {
		Reporter.log("i am run method of demo class",true);	
	}
}
