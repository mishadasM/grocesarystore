package com.obsqura.tests;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {

	
	@Test
	public void MySearchProductTest() {
		
		
		
		lp.Login();
		hp.NavigateToManageProduct();
		pp.ClickSearchBtn();
		pp.ValidateSearchProduct("Maggi");
		
		
	}
}
