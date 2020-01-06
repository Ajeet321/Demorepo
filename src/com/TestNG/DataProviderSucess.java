package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSucess {
	@DataProvider(name="db1")
	public Object[][] credential(){
		Object[][] obj1=new Object[2][2];
		obj1[0][0]="admin1";
		obj1[0][1]="manager1";
		obj1[1][0]="admin2";
		obj1[1][1]="manager2";
		return obj1;
	}
	@DataProvider(name="db2")
		public Object[][] credential2(){
			Object[][] obj2=new Object[2][2];
			obj2[0][0]="admin001";
			obj2[0][1]="manager001";
			obj2[1][0]="admin002";
			obj2[1][1]="manager002";
			return obj2;
	
	}
		@Test(dataProvider="db2")
		public void getcredential(String un,String pwd) {
			
			Reporter.log(un+"  "+pwd,true);
			
		}
		@Test(dataProvider="db1")
		public void getcredential2(String un,String pwd) {
			
			Reporter.log(un+"  "+pwd,true);
			
		}

}
