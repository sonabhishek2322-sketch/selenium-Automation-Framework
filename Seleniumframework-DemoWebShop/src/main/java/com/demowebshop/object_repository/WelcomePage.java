package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	WebDriver driver;
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(xpath = "//div[@class='header-links']//a[@href='/customer/info']")
	private WebElement RegisteredEmail;
	
	//Getter methods
	public WebElement getLoginLink() {
		return this.LoginLink;
	}
	public WebElement getregisterLink() {
		return this.registerLink;
	}
	
	public WebElement getRegisteredEmail() {
		return RegisteredEmail;
	}
	//Business Login
	public void clickOnLogin() {
		LoginLink.click();
		}
	public void clickOnregister() {
		registerLink.click();
		}


}
