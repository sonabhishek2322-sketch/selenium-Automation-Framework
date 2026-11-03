package com.practies;

import org.testng.annotations.Test;

public class assertTest {
	@Test
	public void method() {
		int a = 10;
		int b = 10;
		int sum = a+b;
		if (sum==15) {
			System.out.println("pass");
			
		} else {
			System.out.println("fail");

		}
		
	}

}
/*Even through the script should fail according to the 
 * requirment but TestNg  marks it as passed as the method has compeleted 
 * its execution and has not failed in between thus testNg assertion is
 * neccessary*/
 
