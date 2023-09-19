package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagePaymentMethod extends BaseTest {

	@Test
	public void ManangePaymentMethod() {
		lp.Login();
		hp.NavigateToManagePaymentMethod();
		mm.clickOnEditOption();
		mm.createUpdate();
		String alertText=mm.ValidateManagePaymentMethod();
		if(alertText.contains("Payment Method Updated Successfully")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals(alertText, "Payment Method Updated Successfully");
			}
		
		
	}
}
