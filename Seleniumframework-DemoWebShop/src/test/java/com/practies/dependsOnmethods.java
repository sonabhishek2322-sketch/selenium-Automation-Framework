package com.practies;

import org.testng.annotations.Test;

public class dependsOnmethods {
	@Test()
	public void method1() {
		System.out.println("Executing the method1");
	}
	@Test(dependsOnMethods = "method1")
	public void method2() {
		System.out.println("Executing the method2");
	}

}
