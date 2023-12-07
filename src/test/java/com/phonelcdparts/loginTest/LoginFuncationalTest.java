package com.phonelcdparts.loginTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phonelcdparts.base.BaseTest;
import com.phonelcdparts.loginPages.LoginPage;
import com.phonelcdparts.utilities.PropertiesReader;

public class LoginFuncationalTest extends BaseTest {
	LoginPage lp;
	PropertiesReader pr;
	
	
	
	
	@BeforeTest
	public void openApplication() {
		openApp();
		
		
	}
	@Test
	public void userNameTest() {
		lp = new LoginPage(driver);
		pr = new PropertiesReader();
		lp.myAcountMethod();
		lp.loginButtonMethod();
		lp.userNameMethod(pr.getUserName());
	}
	@Test
	public void passwordTest() {
		lp = new LoginPage(driver);
		pr = new PropertiesReader();
		lp.myAcountMethod();
		lp.loginButtonMethod();
		lp.passwordMethod(pr.getPassword());
		
	}
	
	@AfterTest
	public void closeApplication() {
		closeApp();
		
	}
	
	

}
