package com.obsqura.pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;



public class AdminUserPage extends PageUtility {
	WebDriver driver;
	public AdminUserPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),'New')]")
	WebElement newButton;
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement userType;
	
	@FindBy(xpath = "(//button[@class='btn btn-block-sm btn-danger'])[2]")
	WebElement saveButton;
	
	@FindBy(css= ".alert.alert-success.alert-dismissible")
	WebElement alertTextBox;
	
	public void ClickNewBtn() {
		ClickElement(newButton);
		
	}
	public void CreateAdminUsers(String date) {
		SetTextBox(username,"junu"+date);
		SetTextBox(password,"junu");
		SelectFromStaticDropdown(userType,"staff");
		ScrollUp();
		ClickElement(saveButton);
		
		
	}
	public String ValidateAdminisCreated() {
		
		// TODO Auto-generated method stub
		String alertText= GetElementText(alertTextBox);
		
		return alertText;
	}
}
