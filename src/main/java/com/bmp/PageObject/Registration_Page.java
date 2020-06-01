package com.bmp.PageObject;

import com.bmp.Library.AppLibrary;

public class Registration_Page {
	
	AppLibrary appLibrary;
	

	public static String emailInput="id:txtRegEmail";
	public static String passInput="id:txtRegPassword";
	public static String confirmPassInput="id:txtConfirmPassword";
	public static String registerButt="kc-login";
	

	
	public Registration_Page(AppLibrary appLibrary)
	{
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}
	
	
	public Registration_Page register(String email,String pass,String confirmPass) throws Exception
	{
		appLibrary.enterText(emailInput, email);
		appLibrary.enterText(passInput, pass);
		appLibrary.enterText(confirmPassInput, confirmPass);
		
		

		return new Registration_Page(appLibrary);
			
	}
	
	
}
