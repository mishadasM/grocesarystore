package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ExpenseCategoryPage extends PageUtility{

	
	WebDriver driver;

	public ExpenseCategoryPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css =".btn.btn-rounded.btn-danger")
	private WebElement newBtn;
	
	@FindBy(xpath ="//input[@id='name']")
	private WebElement titleBox;

	@FindBy(xpath ="//button[@name='Create']")
	private WebElement saveBtn;
	

	@FindBy(xpath ="//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchBtn1;
	
	@FindBy(xpath ="//input[@id='un']")
	private WebElement serachTitle;

	@FindBy(xpath ="//button[@name='Search']")
	private WebElement searchBtn2;
	
	@FindBy(xpath ="//a[@class='btn btn-sm btn btn-danger btncss']")
	private WebElement deleteBtn;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement deleteAlertText;
	
	
	
	public void ClickNewBtn() {
		ClickElement(newBtn);
	}
	
	public void CreateUniqueTitle(String Name) {
		String  uniqueName= "Obsqura"+ Name;
		ClickNewBtn();
		SetTextBox(titleBox, uniqueName);
		ClickElement(saveBtn);
	}
	
	public void ValidateUniqueNameIsCreated() {
		
	}
	
	public String DeleteExpenseCategory(String Name) {
		String  uniqueName= "Obsqura"+ Name;
		ClickElement(searchBtn1);
		SetTextBox(serachTitle, uniqueName);
		ClickElement(searchBtn2);
		ClickElement(deleteBtn);
		AcceptAlert();
		
		String text = GetElementText(deleteAlertText);
		return text;
		
	}	
}
