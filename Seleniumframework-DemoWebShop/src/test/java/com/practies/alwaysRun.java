package com.practies;

import org.testng.annotations.Test;

public class alwaysRun {
	@Test
	public void method1() {
		System.out.println("Executing method1");
		
	}
	@Test(alwaysRun = true,dependsOnMethods = "method1")
	public void method2() {
		System.out.println("Executing method2");
	}

}
