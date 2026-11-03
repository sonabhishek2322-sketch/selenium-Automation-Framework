package com.practies;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(priority = -323)
	public void cutting() {
		System.out.println("Cutting vegetables");
		
	}
	@Test
	public void cooking() {
		System.out.println("Cooking vegetables");
		
	}

}
