package com.obsqura.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.obsqura.Exception.NoBrowserFoundException;
import com.obsqura.pages.AdminUserPage;
import com.obsqura.pages.ContactUsPage;
import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.ListDeliveryBoyPage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageFooterTextPage;
import com.obsqura.pages.ManageLocationPage;
import com.obsqura.pages.ManagePaymentMethodPage;
import com.obsqura.pages.ProductsPage;
import com.obsqura.pages.PushNotificationsPage;
import com.obsqura.utilities.TestProperties;

import context.WebdriverContext;

public class BaseTest {
	protected WebDriver driver;
	Properties prop;

	@Parameters({ "browserName" })
	@BeforeMethod
	public void InitializeDriver() throws IOException {
		prop = TestProperties.GetProperties();
		String browserName = prop.getProperty("browser");
		String Environment = prop.getProperty("Environment");
		String Url = prop.getProperty(Environment);

		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();

		}

		else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else {
//			System.out.println("Please Choose Correct BrowserName");
			throw new NoBrowserFoundException("Please choose Correct browserName");
		}

		WebdriverContext.setDriver(driver);
		InitializePages();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Url);

	}

	public LoginPage lp;
	public HomePage hp;
	public ProductsPage pp;
	public ExpenseCategoryPage ecp;
	public ListDeliveryBoyPage ldp;
	public ContactUsPage cp;
	public PushNotificationsPage pn;
	public ManageLocationPage mp;
	public AdminUserPage au;
	public ManagePaymentMethodPage mm;
	public ManageFooterTextPage mt;

	/**
	 * Intialize Globally
	 */
	public void InitializePages() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		pp = new ProductsPage(driver);
		ecp = new ExpenseCategoryPage(driver);
		ldp = new ListDeliveryBoyPage(driver);
		cp = new ContactUsPage(driver);
		pn = new PushNotificationsPage(driver);
		mp = new ManageLocationPage(driver);
		au = new AdminUserPage(driver);
		mm= new ManagePaymentMethodPage(driver);
		mt=new ManageFooterTextPage(driver);
	}

	@AfterMethod
	public void TearDown() {

		driver.quit();
	}
}
