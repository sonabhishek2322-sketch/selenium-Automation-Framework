package com.practies;

import org.testng.annotations.Test;

public class invocationCount {
	@Test(priority = 1,invocationCount = 6)
	public void register() {
		System.out.println("New user Registered");
		
	}
	@Test(priority = 2,invocationCount = 3)
	public void login() {
		System.out.println("New user Logged in");
		
	}

}
