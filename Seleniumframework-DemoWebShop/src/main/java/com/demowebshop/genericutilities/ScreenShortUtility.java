package com.demowebshop.genericutilities;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShortUtility {
	public void CaptureWebPage(WebDriver driver) throws IOException {
		JavaUtility ju = new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(FrameWorkConstants.screenShortpath+"/Dwsfailure"+ju.getTimeStamp()+".png");
		FileHandler.copy(src1, target);
	}

}
