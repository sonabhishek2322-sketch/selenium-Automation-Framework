package com.practies;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsingFindAll {
	static String OHRMUser="Admin";
	static String OHRMPwd="admin123";
	static String SLUser="standard_user";
	static String SLPwd="secret_sauce";
	static String OHRMUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String SLUrl="https://www.saucedemo.com/";
	
	static WebDriver driver;
	UsingFindAll(WebDriver driver){
		PageFactory.initElements(driver,this);
    }
	//UserName
	@FindAll({@FindBy(id="user-name"),@FindBy(name="username")})
	WebElement user;
	
	//Password
	
	@FindAll({@FindBy(id="password"),@FindBy(name="password")})
	WebElement Password;
	//Test Script
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(SLUrl);
		UsingFindAll ufa = new UsingFindAll(driver);
		ufa.user.sendKeys(SLUser);
		ufa.Password.sendKeys(SLPwd,Keys.ENTER);
		driver.quit();
	}
}