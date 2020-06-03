package com.bmp.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bmp.Library.AppLibrary;

public class CreateNewTestPage {

	AppLibrary appLibrary;
	public static String CreateTestButt = "id:btnCreateTest";
	public static String UploadScriptsButt = "id:btnUploadFiles";
	public static String FileInput = "xpath://input[@type='file']";
	public static String addButt = "class:add-button";
	public static String SaveTest = "id:save-test";
	public static String TestName = "id:testName";
	
	
	public static String javaFile="";
	public static String ymlFile="";
	public static String jarFile="";
	public static String appFile="";
	
	

	public CreateNewTestPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		appLibrary.getCurrentDriverInstance();
	}

	public void login(String email, String password) throws Exception {
		appLibrary.enterText(LoginPage.emailLogin, email);
		appLibrary.enterText(LoginPage.passLogin, password);
		appLibrary.clickElement(LoginPage.loginButt);

	}

	public CreateNewTestPage newTest() throws Exception {

		appLibrary.clickElement(LoginPage.CreatNewTest);
		
		appLibrary.findElement(FileInput).sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)/RegistrationTestIos.java");
		Thread.sleep(2000);
		
		appLibrary.findElement(FileInput).sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)/appiumDemoTaurus.yml");
		Thread.sleep(2000);
		
		appLibrary.findElement(FileInput).sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)/Demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar");

		appLibrary.waitForPageToLoad();
		
		appLibrary.findElement(FileInput).sendKeys("D:\\BlazeMeter_Mobile_Automation\\7GBVM\\Beanlogin(4723,8plus)/BeanLogin.app.zip");

		
		appLibrary.waitTillElementisDisplayed(addButt);
		
		appLibrary.findElement(SaveTest).click();

		String url1 = appLibrary.getUrlOfPage();

		String numbers1 = url1.replaceAll("[^0-9]", "");
		appLibrary.findElement(SaveTest).click();
		appLibrary.findElement(TestName).clear();
		appLibrary.findElement(TestName).sendKeys("iOStest(" + numbers1 + ")");
		Thread.sleep(3000);
		appLibrary.findElement(SaveTest).click();
		appLibrary.findElement(LoginPage.CreatNewTest);
		return new CreateNewTestPage(appLibrary);
	}

}
