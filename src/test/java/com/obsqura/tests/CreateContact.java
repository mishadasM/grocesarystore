package com.obsqura.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.ReadExcelUtility;

import models.Person;

public class CreateContact extends BaseTest {

	
	@Test
	public void CreateContactTest() {
		
		lp.Login();
		hp.NavigateToManageContact();
		List<Person> personList = ReadExcelUtility.ReadDataFromExcel();
		
		    for(Person person :personList) {
			cp.EnterDataIntoForm(person);
			
			String alertText = cp.GetContaactUpdateAlertText();
			if(alertText.contains("Alert!\n"
					+ "Contact Updated Successfully")) {
				Assert.assertTrue(true);
			}
			
			else {
				Assert.fail();
			
			}
			
		}
		
	}
}
	

