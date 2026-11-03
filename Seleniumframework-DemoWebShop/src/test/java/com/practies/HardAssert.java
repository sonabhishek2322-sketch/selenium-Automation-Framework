package com.practies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void stringAssertion() {
		String actual = "Hello world!!!";
		//String actual = "Hiii world!!!";
		String expected = "Hello world!!!";
		///Hard assertion
		Assert.assertEquals(actual, expected);
		System.out.println("pass");
	}
	@Test
	public void booleanAssert() {
		int a  = 10;
		int b = 5;
		int sum = a+b;
		//boolean result = sum==10;
		boolean result = sum==15;
		Assert.assertTrue(result);
	}

}
