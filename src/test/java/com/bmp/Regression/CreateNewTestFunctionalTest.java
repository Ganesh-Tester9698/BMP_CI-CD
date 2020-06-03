package com.bmp.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bmp.Library.AppLibrary;
import com.bmp.Library.TestBase;
import com.bmp.PageObject.CreateNewTestPage;

public class CreateNewTestFunctionalTest extends TestBase {
	
	
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("CreateNewTestFunctionalTest");
	}

	@Test
	public void newTestCreator() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		
		
		new CreateNewTestPage(appLibrary).login("qa638@mailinator.com", "test12");
		new CreateNewTestPage(appLibrary).newTest();
		System.out.println("Test is created");
		
		
		

	}

}
