package com.practies;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usingFindBy {
	static WebDriver driver;
	usingFindBy(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "ti6dpd")
	WebElement searchTextfield;
	
	//test Script
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		usingFindBy ufb =new  usingFindBy(driver);
		ufb.searchTextfield.sendKeys("selenium");
		
	}

	
}
