package com.demowebshop.genericutilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("---Test method execution Failed---");
		ScreenShortUtility ssu = new ScreenShortUtility();
		try {
			ssu.CaptureWebPage(driver);
		} catch ( IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("---Test method execution Skipped---");
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("---Test method execution Started---");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("---Test method executed Successfully---");
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("---Execution initialted---");
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("---Execution terminated---");
	}
	

}
