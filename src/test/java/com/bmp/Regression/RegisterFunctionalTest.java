package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.Registration_Page;

public class RegisterFunctionalTest extends TestBase {
	
	
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("RegisterFunctionalTest");
	}

	@Test
	public void registrationTest() throws Exception {
		
		String unique = appLibrary.getFormattedDate() + "_" + appLibrary.randInt();
		String emailAddress = "neoTest_" + unique;
		System.out.println(emailAddress);
		
		
		
		
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		appLibrary.clickElement(Registration_Page.Signupbutt);
		
		new Registration_Page(appLibrary).register(emailAddress+"@mailinator.com", "test12", "test12");
		
		
		System.out.println("Registration functional test passed");

		
		
	}

}
