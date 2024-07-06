package actions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.EbayHome_Elements;
import steps.common_Steps;

public class EbayHome_Actions {
	
	//Action class have methods that interact with the web page's elements
	//You pull in the elements for the ebayhome page and encapsulate them in action methods
	
	WebDriver driver;
	EbayHome_Elements ebayhome_elements;
	
	public EbayHome_Actions(common_Steps common) {
		this.driver = common.getDriver();
		ebayhome_elements = new EbayHome_Elements(driver);
	}
	
	public void clickAdvancedLink() {
		ebayhome_elements.advancedLink.click();
	}
	
	public void searchAnitem(String srchString) {
		ebayhome_elements.searchBox.sendKeys(srchString);
	}
	
	public void clickSearchButton() {
		ebayhome_elements.searchButton.click();
	}
	
	public int getSearchItemsCount() {
		String itemCount = ebayhome_elements.numOfItems.getText().trim();
		 String itemCount2 = itemCount.replace(",","");
		 int itemCountInt = Integer.parseInt(itemCount2);
		 return itemCountInt;
	}
	
	public void searchCategory(String category) {
		List <WebElement> cat = ebayhome_elements.catOptions;
		for(WebElement ele : cat) {
			 if(ele.getText().trim().toLowerCase().equals(category.toLowerCase())) {
				 ele.click();
				 break;
		}
		
	}

}
	public void clickOnLinkByText(String text) {
		driver.findElement(By.linkText(text)).click();
	}
}
