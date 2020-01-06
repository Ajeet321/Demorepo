package com.TestNG;

import org.testng.annotations.Test;

public class TestNGfeatures1 {

	@Test
	public void loginTest() {
		
		System.out.println("login test");
	
	}
	@Test(dependsOnMethods ="loginTest")
	public void homeTest() {
		
		System.out.println("login test");
		
		
	}
	@Test(dependsOnMethods ="loginTest")
	public void searchTest() {
		
		System.out.println("login test");
		
		
	}
	@Test(dependsOnMethods ="loginTest")
	public void regTest() {
		
		System.out.println("login test");
		
		
	}
	
}

