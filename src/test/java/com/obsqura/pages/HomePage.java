package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class HomePage extends PageUtility {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),'Manage Product')]")
	private WebElement manageProduct;

	@FindBy(xpath = "(//*[contains(text(),'Manage Expense')])[1]")
	private WebElement manageExpenseDropdown;

	@FindBy(xpath = "(//*[normalize-space() = 'Expense Category'])[1]")
	private WebElement manageExpense;

	@FindBy(xpath = "//*[contains(text(),'Manage Delivery Boy')]")
	private WebElement manageDeliveryBoy;

	@FindBy(xpath = "//p[normalize-space()='Manage Content']")
	private WebElement manageContent;
	
	 @FindBy(xpath="//p[text()='Manage Footer Text']")
	 private WebElement mangefootertext;

	@FindBy(xpath = "//p[normalize-space()='Push Notifications']")
	private WebElement pushNotifications;
	
	@FindBy(xpath = "//p[normalize-space()='Admin Users']")
	private WebElement adminUser;
	
	@FindBy(xpath="//p[text()='Manage Payment Methods']")
	private WebElement managePayment;
	   
	@FindBy(xpath = "//p[normalize-space()='Manage Location']")
	private WebElement manageLocation;
	

	@FindBy(xpath = "//p[normalize-space()='Manage Contact']")
	private WebElement manageContact;

	public void NavigateToManageProduct() {
		ClickElement(manageProduct);
	}

	public void NavigateTo_ManageDeliverBoy() {
		ClickElement(manageDeliveryBoy);
	}

	public void NavigateToManageContact() {
		ClickElement(manageContent);
		ClickElement(manageContact);
	}
	public void NavigateToManangeFooterText()
	{
		ClickElement(manageContent);
		ClickElement(mangefootertext);
		
	}

	public void NavigateToManageExpense() {
		ClickElement(manageExpenseDropdown);
		ClickElement(manageExpense);

	}

	public void NavigateToMangeLocation() {
		ClickElement(manageLocation);
		
	}

	public void NavigateToPushNotifications() {
		
		ClickElement(pushNotifications);

	}

	public void NavigateToAdminUser() {
		ClickElement(adminUser);
		
	}
	

	
	public void NavigateToManagePaymentMethod() {
		ClickElement(managePayment);
		
	}
}