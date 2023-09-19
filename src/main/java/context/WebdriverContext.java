package context;

import org.openqa.selenium.WebDriver;

public class WebdriverContext {

	private static InheritableThreadLocal<WebDriver> driverInstance = new InheritableThreadLocal<>();

	public static WebDriver getDriver() {
		if (driverInstance.get() == null) {
			throw new IllegalStateException("webdriver not found ! so Please set wedriver instance");
		}
		else {
			return driverInstance.get();
		}
	}

	public static void setDriver(WebDriver driver) {
		driverInstance.set(driver);
	}
}
