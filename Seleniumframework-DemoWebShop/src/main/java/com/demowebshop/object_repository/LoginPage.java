package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	//Locators
	@FindBy(id = "Email")
	private WebElement EmailTextField;
	
	@FindBy(id = "Password")
	private WebElement PasswordTextField;
	
	@FindBy(css = "[value='Log in']")
	private WebElement LoginButton;
	//Getters

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	//Business Logic
	
	public void LoginAsvalidUser(String ValidEmail,String ValidPasssword) {
		EmailTextField.sendKeys(ValidEmail);
		PasswordTextField.sendKeys(ValidPasssword);
		LoginButton.click();
		
	}

}
