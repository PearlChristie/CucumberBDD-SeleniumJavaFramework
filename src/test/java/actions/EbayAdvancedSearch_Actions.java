package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayAdvancedSearch_Elements;
import elements.EbayHome_Elements;
import steps.common_Steps;

public class EbayAdvancedSearch_Actions {
	
	private WebDriver driver;
	EbayAdvancedSearch_Elements ebayadvancedsearch_elements;
	
	public EbayAdvancedSearch_Actions(common_Steps common) {
		this.driver = common.getDriver();
		ebayadvancedsearch_elements = new EbayAdvancedSearch_Elements(driver);
	}
	
	public void clickOnLogo() {
		ebayadvancedsearch_elements.ebayLogo.click();
	}
	
	public void enterSearchString(String text) {
		ebayadvancedsearch_elements.searchString.sendKeys(text);
	}
	
	public void enterExcludedString(String exclude) {
		ebayadvancedsearch_elements.excludeString.sendKeys(exclude);
	}
	
	public void enterMinPrice(String minPrice) {
		ebayadvancedsearch_elements.minPrice.sendKeys(minPrice);
	}
	
	public void enterMaxPrice(String maxPrice) {
		ebayadvancedsearch_elements.maxPrice.sendKeys(maxPrice);
	}
	
	public void searchBtn() {
		ebayadvancedsearch_elements.submitBtn.click();
	}

}
