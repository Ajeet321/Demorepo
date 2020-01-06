package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingExcution {
	

		@Test(groups="Smoke")
		public void smokeTest1()
		{
			Reporter.log("SmokeTest1",true);
		}
		
		
		@Test(groups="Smoke")
		public void smokeTest2()
		{
			Reporter.log("SmokeTest2",true);
		}
		
		@Test(groups="Smoke")
		public void smokeTest3()
		{
			Reporter.log("SmokeTest3",true);
		}
		
		@Test(groups="Smoke")
		public void smokeTest4()
		{
			Reporter.log("SmokeTest4",true);
		}
		
		@Test(groups="FT")
		public void FTTest1()
		{
			Reporter.log("FTTest1",true);
		}
		
		@Test(groups="FT")
		public void FTTest2()
		{
			Reporter.log("FTTest2",true);
		}
		
		@Test(groups="IT")
		public void ITTest1()
		{
			Reporter.log("ITTest1",true);
		}
		@Test(groups="IT")
		public void ITTest2()
		{
			Reporter.log("ITTest2",true);
		}
		@Test(groups="IT")
		public void ITTest3()
		{
			Reporter.log("ITTest3",true);
		}
		@Test(groups="RegrTest")
		public void RegressionTest1()
		{
			Reporter.log("RegressionTest1",true);
		}
		@Test(groups="RegrTest")
		public void RegressionTest2()
		{
			Reporter.log("RegressionTest2",true);
		}
		
	}



