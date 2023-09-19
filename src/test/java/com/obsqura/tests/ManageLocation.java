package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageLocation extends BaseTest {
	@Test
	public void MyManageLocationTest()  {
		lp.Login();
		hp.NavigateToMangeLocation();
		mp.createLocation();
		String text=mp.ValidateManageLocation();
		if (text.contains("Location Created Successfully")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals(text, "Location Created Successfully");
		}
		
	}

}
