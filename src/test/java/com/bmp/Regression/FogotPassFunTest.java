package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.ForgotPassPage;
import com.bmp.PageObject.Registration_Page;

public class FogotPassFunTest extends TestBase {
	public static String emailLogin = "id:txtEmail";
	public static String passLogin = "id:txtPassword";
	public static String loginButt = "id:kc-login";
	public static String CreatNewTest = "xpath://button[text()='Create Test']";



	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("FogotPassFunTest");
	}

	@Test
	public void forgotPass() throws Exception {
		String newPass="test123";
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		String unique = appLibrary.getFormattedDate() + "_" + appLibrary.randInt();
		String emailAddress = "neoTest_" + unique + "@mailinator.com";
		System.out.println(emailAddress);

		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		appLibrary.clickElement(Registration_Page.registerButt);

		new Registration_Page(appLibrary).register(emailAddress, "test12", "test12");

		new ForgotPassPage(appLibrary).forgotPass(emailAddress,newPass);

		appLibrary.enterText(emailLogin, emailAddress);
		appLibrary.enterText(passLogin, newPass);
		appLibrary.clickElement(loginButt);
		appLibrary.findElement(CreatNewTest);

	}

}
