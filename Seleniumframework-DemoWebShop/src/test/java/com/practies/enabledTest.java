package com.practies;

import org.testng.annotations.Test;

public class enabledTest {
		@Test(enabled = false)
		public void method1() {
			System.out.println("Executing the method1");
		}
		@Test(enabled = true)
		public void method2() {
			System.out.println("Executing the method2");
		}


}
