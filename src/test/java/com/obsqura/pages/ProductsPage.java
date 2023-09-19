package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.obsqura.utilities.PageUtility;
public class ProductsPage extends PageUtility {

	
	WebDriver driver;

	public ProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement title_input;
	
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement searchProductBtn;
	
	@FindBy(xpath = "//table//tbody//tr//td")
	private WebElement productTitle;

	
	public void ClickSearchBtn() {
		searchBtn.click();
	}
	

	public void ValidateSearchProduct(String productName) {
		title_input.sendKeys(productName);
		searchProductBtn.click();
		String text=productTitle.getText();
		System.out.println(text);
		
		if(text.contains(productName)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	
		
	}
}
