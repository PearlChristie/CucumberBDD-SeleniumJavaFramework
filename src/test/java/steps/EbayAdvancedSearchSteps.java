package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearchSteps {
Common_Actions common_actions;
EbayAdvancedSearch_Actions ebayadvancedsearch_actions;
	
	//This is a constructor which will be used to create an object of this class
	//The argument in () passed in this constructor is getting the object of common_steps class which
	//creates the driver and returns the driver
	//we assign the driver from the common steps class to the home steps class driver instance variable
	
	public EbayAdvancedSearchSteps(Common_Actions common_actions,EbayAdvancedSearch_Actions ebayadvancedsearch_actions ) {
		this.common_actions = common_actions;
		this.ebayadvancedsearch_actions = ebayadvancedsearch_actions;
	}
	
	@Given("I am on Ebay Advanced Search Page")
	public void i_am_on_ebay_advanced_search_page() {
	  common_actions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
	}
	
	@When("I click on Ebay Logo")
	public void i_click_on_ebay_logo() {
		ebayadvancedsearch_actions.clickOnLogo(); 
	}
	
	@Then("I am navigated to Ebay Home Page")
	public void i_am_navigated_to_ebay_home_page() {
		String expUrl = "https://www.ebay.com/";
		String actUrl = common_actions.getCurrentPageUrl();
		if(!expUrl.equals(actUrl)){
			fail("Page does not navigate to expected page");
		}
	 
	}

	@When("I advanced search an item")
	public void i_advanced_search_an_item(DataTable dataTable) throws InterruptedException {
		ebayadvancedsearch_actions.enterSearchString(dataTable.cell(1,0));
		ebayadvancedsearch_actions.enterExcludedString(dataTable.cell(1, 1));
		ebayadvancedsearch_actions.enterMinPrice(dataTable.cell(1, 2));
		ebayadvancedsearch_actions.enterMaxPrice(dataTable.cell(1, 3));
		ebayadvancedsearch_actions.searchBtn();
		Thread.sleep(3000);
	}

	



}
