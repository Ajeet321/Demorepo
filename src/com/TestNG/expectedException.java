package com.TestNG;

import org.testng.annotations.Test;

public class expectedException {
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		
String i="aswws10";
Integer.parseInt(i);
		
	}

}
