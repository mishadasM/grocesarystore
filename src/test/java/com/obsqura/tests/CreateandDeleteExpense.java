package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;



public class CreateandDeleteExpense  extends BaseTest{
	
	@Test
	public void MyCreateDeleteExpense() throws IOException {
		
		lp.Login();
		hp.NavigateToManageExpense();
	
		String date=DateUtility.GetCurrentDate();
		ecp.CreateUniqueTitle(date);
		ecp.ValidateUniqueNameIsCreated();
		String text = ecp.DeleteExpenseCategory(date);
	    
		/**
		 * Validation
		 */
			
		if(text.contains("Expense Category Deleted Successfully")) {
			Assert.assertTrue(true);
		}
		else {
		Assert.assertEquals(text, "Expense Category Deleted Successfully");
		}
	}

}