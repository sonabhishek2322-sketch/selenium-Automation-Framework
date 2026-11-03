package com.demowebshop.login;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.demowebshop.genericutilities.BaseClass;
import com.demowebshop.genericutilities.ListenerImplementation;
import com.demowebshop.object_repository.LoginPage;
import com.demowebshop.object_repository.WelcomePage;
@Listeners(ListenerImplementation.class)
public class LoginTest extends  BaseClass {
	@Test(groups = {"Smoke","Regression"})
	public void loginAsValiduser() throws IOException {
				WelcomePage wp = new WelcomePage(driver);
				LoginPage lp = new LoginPage(driver);
				//Click on Login Link
				wp.clickOnLogin();
				lp.LoginAsvalidUser(email, password);
				//Verify the user is able to Login
				Assert.assertEquals(wp.getRegisteredEmail().getText(),email);
	}

}
