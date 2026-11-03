package com.practies;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {
	//Creating DataProvider method
	@DataProvider(name = "loginData")
	public Object[][] getData(){
		return new Object[][] {
			{"admin", "admin123"},
			{"user","user123"},
			{"test","test123"}
			};
//		Object[][] data = new Object[][] {
//			{"admin", "admin123"},
//			{"user","user123"},
//			{"test","test123"}
//			};
//		return data;
	}
   @Test(dataProvider = "loginData")
   public void testMethod(String username,String password) {
	   System.out.println("This username is : "+username);
	   System.out.println("This password is :"+password);
	   System.out.println("---------------------------------");
   }
}
