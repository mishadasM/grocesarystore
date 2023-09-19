package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManagePaymentMethodPage extends PageUtility {
	WebDriver driver;

	public ManagePaymentMethodPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement edit;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement title;

	@FindBy(xpath = "//input[@name='limit']")
	WebElement paylimit;

	@FindBy(xpath = "//button[@name='Update']")
	WebElement updatebutton;
	@FindBy(xpath="//div[contains(@class,'dismissible')]")
	private WebElement updationsuccessalert;

	public void clickOnEditOption() {
		ClickElement(edit);

	}

	public void createUpdate() {
		SetTextBox(title, "AOA");
		SetTextBox(paylimit, "100");
		ClickElement(updatebutton);

	}

	public String ValidateManagePaymentMethod() {
		
		String text = GetElementText(updationsuccessalert);
		return text;
		

	}

	

}
