package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PushNotifications extends BaseTest {
	@Test

	public void PushNotificationsTest() {
		lp.Login();
		hp.NavigateToPushNotifications();
		pn.createPushNotification();
		String textAlert=pn.validatePushNotification();
		
		if(textAlert.contains("Message send successfully")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals(textAlert, "Message send successfully");
			}
	}

}
