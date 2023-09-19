package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManageLocationPage extends PageUtility {
	WebDriver driver;

	public ManageLocationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css =".btn.btn-rounded.btn-danger")
	WebElement newBtn;

	@FindBy(xpath = "//select[@id='country_id']")
	WebElement country;

	@FindBy(xpath = "//select[@id='st_id']")
	WebElement state;

	@FindBy(xpath = "//input[@name='location']")
	WebElement location;

	@FindBy(xpath = "//input[@id='delivery']")
	WebElement deliveryCharge;

	@FindBy(css = ".btn.btn-danger")
	WebElement saveBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertBox;

	public void createLocation() {
		ClickElement(newBtn);
		SelectFromStaticDropdown(country, "230");
		SelectFromStaticDropdown(state, "3805");
		SetTextBox(location, "Test5000/10/3 12:15:08");
		SetTextBox(deliveryCharge, "200");
		ScrollUp();
		WaitUntilClickable(saveBtn);
		ClickElement(saveBtn);


	}

	public String ValidateManageLocation() {
		// TODO Auto-generated method stub

		return GetElementText(alertBox);
	}

}
