package com.obsqura.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.obsqura.utilities.PageUtility;

public class LoginPage extends PageUtility {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This @FindsBy technique is called PageFactory Concept
	 */

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;


	@FindBy(css ="input[placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	
	
	public void Login() {
		SetTextBox(username, "admin");
		SetTextBox(password, "admin");
		ClickElement(submitBtn);
	
	}
	
	
	


}
