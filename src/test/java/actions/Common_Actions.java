package actions;

import org.openqa.selenium.WebDriver;

import steps.common_Steps;

public class Common_Actions {
	
	private WebDriver driver;
	
	public Common_Actions(common_Steps common) {
		this.driver = common.getDriver();
	}
	
	public void goToUrl(String url) {
		driver.get(url);
	}
	
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
	
	public void quitWebDriver() {
		driver.quit();
	}
}
