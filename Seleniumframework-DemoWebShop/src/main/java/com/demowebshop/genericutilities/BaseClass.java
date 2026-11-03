package com.demowebshop.genericutilities;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	public WebDriverUtility wdu;
	public String browser;
	public String url;
	public String email;
	public String password;
	//Config Annotation
		@BeforeSuite
		public void configBeforeSuite() {
			Reporter.log("----Excuting Before Suite----",true);
		}
		@AfterSuite
		public void configAfterSuite() {
			Reporter.log("----Excuting After Suite----",true);
		}
		@BeforeTest
		public void configBeforeTest() {
			Reporter.log("----Excuting Before Test----",true);
			
		}
		@AfterTest
		public void configAfterTest() {
			Reporter.log("----Excuting After Test----",true);
			
		}
		@BeforeClass
		public void configBeforeClass() throws FileNotFoundException, IOException {
			System.out.println("----Excuting Before Class----");
			FileUtility fu = new FileUtility();
			browser = fu.readKeyValueFromPropertyfile("browser");
			url = fu.readKeyValueFromPropertyfile("applicationURL");
			email = fu.readKeyValueFromPropertyfile("validEmail");
			password = fu.readKeyValueFromPropertyfile("validPassword");
			
		}
		@AfterClass
		public void configAfterClass() {
			Reporter.log("----Excuting after Class----",true);	
		}
	
		//@Parameters("browser")
		@BeforeMethod
		//public void configBeforeMethod(String browser) {parameter meardument dena he
		public void configBeforeMethod() {
			Reporter.log("----Excuting Before method----",true);
			//Lunching The Browser
			
			if (browser.contains("chrome")) {
				driver = new ChromeDriver();	
			}else if (browser.contains("edge")) {
				driver = new EdgeDriver();	
			}else if (browser.contains("firefox")) {
				driver = new FirefoxDriver();
			}else {
				System.out.println("Enter Valid Browser");
			}
			//Maximize
			wdu=new WebDriverUtility(driver);
			wdu.maximizeBrowser();
			//Wait
			waitUtility wu = new waitUtility(driver);
			wu.waitforAllLocatedElemets(10);
			//Navigating to app
			wdu.openApplication(url);
		}
		
		@AfterMethod
		 public void configAfterMethod() {
			Reporter.log("----Excuting After method----",true);
			//quite the browser
			wdu.terminateBrowser();
		}
		
	}

