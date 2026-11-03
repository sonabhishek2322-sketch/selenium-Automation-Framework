package com.demowebshop.genericutilities;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class WebDriverUtility {
	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
			this.driver = driver;
		}
	//Navigate to the application
	public void openApplication(String appURL) {
		driver.get(appURL);
	}
	//fetch title 
	public String fetchTitle() {
		return driver.getTitle();
	}
	//fetch URL
	public String fetchurl() {
		return driver.getCurrentUrl();
	}
	//Get Window handle
	public String fetchwindowID() {
		return driver.getWindowHandle();
	}
	//Get Window handles
	public Set<String> fetchAllwindowIDs() {
		return driver.getWindowHandles();
	}
	//switch to child window
	public void switchcontrolToAwindow(String title) {
		for (String handle : fetchAllwindowIDs()) {
			driver.switchTo().window(handle);
			if (fetchTitle().contains(title)) {
				break;
			}
		}
	}
	
	//open a new tab
	public void openNewTab() {
		driver.switchTo().newWindow(WindowType.TAB);	
	}
	//switch to alert
	public void acceptAlert() {
		driver.switchTo().alert().accept();
		
	}
	public void typeandAcceptTheAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();	
	}
	//Quit
	public void terminateBrowser() {
		driver.quit();	
	}
	//switch to frame
	public void switchToFrame(String nameorId) {
		driver.switchTo().frame(nameorId);	
	}
	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
		
	}
	
		public void maximizeBrowser() {
			driver.manage().window().maximize();
		}
	}


