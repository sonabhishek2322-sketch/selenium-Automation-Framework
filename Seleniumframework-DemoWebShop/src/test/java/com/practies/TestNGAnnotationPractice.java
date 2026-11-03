package com.practies;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGAnnotationPractice {
	//Config Annotation
	@BeforeSuite
	void configBeforeSuite() {
		System.out.println("----Excuting Before Suite----");
	}
	@AfterSuite
	void configAfterSuite() {
		System.out.println("----Excuting After Suite----");
	}
	@BeforeTest
	void configBeforeTest() {
		System.out.println("----Excuting Before Test----");
		
	}
	@AfterTest
	void configAfterTest() {
		System.out.println("----Excuting After Test----");
		
	}
	@BeforeClass
	void configBeforeClass() {
		System.out.println("----Excuting Before Class----");
		
	}
	@AfterClass
	void configAfterClass() {
		System.out.println("----Excuting after Class----");	
	}
	@BeforeMethod
	void configBeforeMethod() {
		System.out.println("----Excuting Before method----");
		
	}
	@AfterMethod
	void configAfterMethod() {
		System.out.println("----Excuting After method----");
		
	}
	
}
