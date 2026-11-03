package com.practies;

import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut = 1000)
	public void method1() {
		System.out.println("Executing the method1");
	}
	@Test(dependsOnMethods = "method1")
	public void method2() {
		System.out.println("Executing the method2");
	}
	

}
