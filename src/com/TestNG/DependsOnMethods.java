package com.TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void Register1() {
		Assert.fail();
		Reporter.log("Succesfully register1",true);
		
	}
	@Test
	public void Register2() {
		
		Reporter.log("Suceesfully Register",true);
		
	}
	@Test(dependsOnMethods= {"Register1","Register2"})
	public void delete() {
		
		Reporter.log("Successfully deleted",true);
		
	}

}
