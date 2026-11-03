package com.practies;

import org.testng.annotations.Test;

public class expectedException {
	@Test(expectedExceptions = ArithmeticException.class)
	public void method1() {
		int a = 1;
		int b = 0;
		int result = a/b;
		System.out.println(result);
		
	}
	@Test(alwaysRun = true,dependsOnMethods = "method1")
	public void method2() {
		System.out.println("Executing method2");
	}

}
