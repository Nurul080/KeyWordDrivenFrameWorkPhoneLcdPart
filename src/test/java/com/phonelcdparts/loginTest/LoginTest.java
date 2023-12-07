package com.phonelcdparts.loginTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phonelcdparts.base.BaseTest;
import com.phonelcdparts.loginPages.LoginPage;
import com.phonelcdparts.utilities.PropertiesReader;



public class LoginTest extends BaseTest  {
	LoginPage loginPage;
	PropertiesReader propertiesReader;
	
	
	@BeforeMethod
	public void openApplication() {
		openApp();
	}
	
	

	@Test
	public void loginTest() {
		propertiesReader = new PropertiesReader();
		loginPage = new LoginPage(driver);
		loginPage.myAcountMethod();
		loginPage.loginButtonMethod();
		loginPage.userNameMethod(propertiesReader.getUserName());
		loginPage.passwordMethod(propertiesReader.getPassword());
		//loginPage.singInMethod();
	
	
	}
	@AfterMethod
	public void closeApplication() {
		closeApp();
		
	}
	
	
}
