package com.obsqura.tests;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;


public class LoginTest extends BaseTest {
	

	@Test 
	public void MyLoginTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login();
	    
	}
}
