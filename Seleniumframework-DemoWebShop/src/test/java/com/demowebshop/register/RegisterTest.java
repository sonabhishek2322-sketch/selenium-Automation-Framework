package com.demowebshop.register;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.demowebshop.genericutilities.BaseClass;
import com.demowebshop.genericutilities.ExcelUtility;
import com.demowebshop.genericutilities.JavaUtility;
import com.demowebshop.genericutilities.ListenerImplementation;
import com.demowebshop.genericutilities.ScreenShortUtility;
import com.demowebshop.object_repository.RegisterPage;
import com.demowebshop.object_repository.RegisterResultPage;
import com.demowebshop.object_repository.WelcomePage;
@Listeners(ListenerImplementation.class)
public class RegisterTest extends BaseClass {
	@Test(groups = "Regression",dataProvider = "RegisterDetails",dataProviderClass = ExcelUtility.class)
	public void registerAsNewUser(String firstName,String lastName,String gender,
			String emailA,String emailB,String password) throws FileNotFoundException, IOException {
		//Read the data from excel File
//		ExcelUtility eu = new ExcelUtility();
//			String firstName = eu.readDataFromSpecificCell("RegisterUser", 1, 1);
//			String lastName = eu.readDataFromSpecificCell("RegisterUser", 1, 2);
//			String gender = eu.readDataFromSpecificCell("RegisterUser", 1, 3);
//			String emailA = eu.readDataFromSpecificCell("RegisterUser", 1, 4);
//			String emailB = eu.readDataFromSpecificCell("RegisterUser", 1, 5);
//			String password = eu.readDataFromSpecificCell("RegisterUser", 1, 6);
		WelcomePage wp = new WelcomePage(driver);
		RegisterPage rp = new RegisterPage(driver);
		RegisterResultPage rrp = new RegisterResultPage(driver);
		JavaUtility ju = new JavaUtility();
		//Click on Register Link
		wp.clickOnregister();
		rp.registerAsNewUser(gender, firstName, lastName, emailA, ju.getRandomNumber(), emailB, password, password, password);
		//Verify if Registeration is successful
		
		Assert.assertTrue(rrp.getSuccessMassege().isDisplayed());
	}

}
