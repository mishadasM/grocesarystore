package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.obsqura.utilities.PageUtility;

public class ListDeliveryBoyPage extends PageUtility {

	
	WebDriver driver;

	public ListDeliveryBoyPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".btn.btn-rounded.btn-danger")
	private WebElement newBtn;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(css= ".btn.btn-danger")
	private WebElement saveBtn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement AddDeliveryBoy;
	
	public void CreateDeliveryBoy(String date) {
		ClickElement(newBtn);
		SetTextBox(name, "Client");
		SetTextBox(userName, "client"+date);
		SetTextBox(password, "12345");
		ScrollUp();
		WaitUntilClickable(saveBtn);
		//ClickElement(saveBtn);
		
		
	}
	
	public String ValidateDeliveryBoyIsCreated() {
		String alertText= GetElementText(AddDeliveryBoy);
		return alertText;
		
	}
	
}
