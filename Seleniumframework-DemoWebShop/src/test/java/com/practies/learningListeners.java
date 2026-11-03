package com.practies;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(learningListeners.class)
public class learningListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test method initiated");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test method Executed with success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test method is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Method has Skipped Execution");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution has initiated");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution is completed");
	}
	
	@Test
	public void method() {
		System.out.println("Executing Test method");
	}

}
