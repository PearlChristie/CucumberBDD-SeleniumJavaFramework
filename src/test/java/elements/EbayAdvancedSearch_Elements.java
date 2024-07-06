package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvancedSearch_Elements {
	
	WebDriver driver;

	@FindBy(xpath = "//a[@id='gh-la']") public WebElement ebayLogo;
	
	@FindBy(xpath = "//input[@data-testid='_nkw']") public WebElement searchString;
	
	@FindBy(xpath = "//input[@data-testid='_ex_kw']") public WebElement excludeString;
	
	@FindBy(xpath = "//input[@name='_udlo']") public WebElement minPrice;
	
	@FindBy(xpath = "//input[@name='_udhi'") public WebElement maxPrice;

	@FindBy(xpath = "//body/div[2]/div[1]/main[1]/form[1]/div[2]/button[1]") public WebElement submitBtn;
	
	public EbayAdvancedSearch_Elements(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
