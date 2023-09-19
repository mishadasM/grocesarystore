package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

import models.Person;

public class ManageFooterTextPage extends PageUtility {
	WebDriver driver;

	public ManageFooterTextPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="(//a[@role='button'])[1]")
	WebElement editoption;
	
    @FindBy(xpath="//textarea[@id='content']")
    WebElement address;
    
    @FindBy(xpath="//input[@id='email']")
    WebElement email;
    
    @FindBy(xpath="//input[@id='phone']")
    WebElement phone;
    
    @FindBy(xpath="//button[@name='Update']")
    WebElement update;
    
    @FindBy(xpath="//div[contains(@class,'dismissible')]")
    WebElement successalert;
    
    public void ClickEditBtn() {
		ClickElement(editoption);
	}
    public void TextInformation(Person  person) {
		ClickEditBtn();
		SetTextBox(address,person.address);
		SetTextBox(email,person.email);
		SetTextBox(phone,  Integer.toString(person.phoneNumber));
		ClickElement(update);
	}
    public String GetUpdateAlertText() {
		return GetElementText(successalert);
	}


}


