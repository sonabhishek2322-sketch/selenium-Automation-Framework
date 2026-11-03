package com.practies;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SfotAssertion {
	@Test
	public void stringAssertion() {
		String actual = "Hello world!!!";
		//String actual = "Hiii world!!!";
		String expected = "Hello world!!!";
		//SoftAssertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
		System.out.println("---pass---");
		
	}
	@Test
	public void booleanAssert() {
		int a  = 10;
		int b = 5;
		int sum = a+b;
		//boolean result = sum==10;
		boolean result = sum==15;
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(result);
		sa.assertAll();
		System.out.println("---pass---");
	}


}
