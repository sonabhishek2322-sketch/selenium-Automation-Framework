package com.demowebshop.genericutilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUtility {
    WebDriver driver;
	public waitUtility(WebDriver driver) {
		this.driver = driver;
	}
	//wait for elements to load
	public void waitforAllLocatedElemets(long secondsToWait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsToWait));
		
	}
	// wait for page to load
	public void waitforWebPageToLoad(long secondsToWait) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(secondsToWait));
		
	}
	//wait for elemet to be clickable
	public void waitforElementTobeClickable(long secondsToWait,WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(secondsToWait));
		
		wait.until(ExpectedConditions.visibilityOf(target));
		
	}
	//wait for element to visible
	

}
