package com.obsqura.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.ReadExcelUtility;

import models.Person;

public class ManageFooterText extends BaseTest {
	
@Test
	public void ManangeFooter() {
		lp.Login();
		hp.NavigateToManangeFooterText();
List<Person> personList = ReadExcelUtility.ReadDataFromExcel();
		
		for(Person person :personList) {
			mt.TextInformation(person);
			
			String alertText = mt.GetUpdateAlertText();
			
			if(alertText.contains("Updated Successfully")) {
				Assert.assertTrue(true);
			}
			else {
			Assert.assertEquals(alertText, "Updated Successfully");
			}
			
			



}
}


}
