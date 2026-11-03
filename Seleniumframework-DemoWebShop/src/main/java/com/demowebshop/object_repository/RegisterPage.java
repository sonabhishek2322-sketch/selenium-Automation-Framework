package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-male")
	private WebElement MaleRadioButton;
	@FindBy(id = "gender-female")
	private WebElement FemaleRadioButton;
	@FindBy(id = "FirstName")
	private WebElement firstnameTextfield;
	@FindBy(id = "LastName")
	private WebElement lastnameTextfield;
	@FindBy(id = "Email")
	private WebElement emailTextfield;
	@FindBy(id = "Password")
	private WebElement passwordTextfield;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswordTextfield;
	@FindBy(id = "register-button")
	private WebElement registerButton;
	public WebElement getMaleRadioButton() {
		return MaleRadioButton;
	}
	public WebElement getFemaleRadioButton() {
		return FemaleRadioButton;
	}
	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}
	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getConfirmpasswordTextfield() {
		return confirmpasswordTextfield;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public void registerAsNewUser(String gender,String firstname,String lastname,String emailA,
			int randomNo,String emailB,String password,String password1,String register) {
		if (gender.contains("Male")) {
			MaleRadioButton.click();
		} else {
			FemaleRadioButton.click();

		}
		firstnameTextfield.sendKeys(firstname);
		lastnameTextfield.sendKeys(lastname);
		emailTextfield.sendKeys(emailA+randomNo+emailB);
		passwordTextfield.sendKeys(password);
		confirmpasswordTextfield.sendKeys(password1);
		password1.split(register);
		registerButton.click();
	}
}
