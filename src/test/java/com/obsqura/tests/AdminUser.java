package com.obsqura.tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;

public class AdminUser extends BaseTest{
@Test
public void AdminUserTest() {
	lp.Login();
	hp.NavigateToAdminUser();
	String date = DateUtility.GetCurrentDate();
	au.ClickNewBtn();
	au.CreateAdminUsers(date);
	String alertText=au.ValidateAdminisCreated();
		
		if(alertText.contains("Alert!\n"
				+ "User Created Successfully")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals(alertText, "Message send successfully");
			}
	
}
}

