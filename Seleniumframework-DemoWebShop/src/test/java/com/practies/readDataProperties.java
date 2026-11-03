package com.practies;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readDataProperties {

	public static void main(String[] args) throws IOException {
		//1 create object file class and handle fileInputStreamException
		File f  = new File("C:\\Users\\Rohit\\Sonali");
		//2 Create object of FileInputStream and handle IOException
		FileInputStream fis = new FileInputStream(f);
		//3 Create objet of Properties class
		Properties property = new Properties();
		// 4 call load() to load the FIS in the Properties object
		property.load(fis);
		// 5 read the values using key from the proprteis file
		String Browser = property.getProperty("browser");
		String url = property.getProperty("applicationURL");
		System.out.println(Browser);
		System.out.println(url);

	}

}
