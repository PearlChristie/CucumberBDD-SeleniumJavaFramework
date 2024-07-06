package steps;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import actions.EbayHome_Actions;
import elements.EbayAdvancedSearch_Elements;
import elements.EbayHome_Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_HomeSteps {
	
	Common_Actions common_actions;
	EbayHome_Actions ebayhome_actions;
	
	//This is a constructor which will be used to create an object of this class
	//The argument in () passed in this constructor is getting the object of common_steps class which
	//creates the driver and returns the driver
	//we assign the driver from the common steps class to the home steps class driver instance variable
	
	public Ebay_HomeSteps(Common_Actions common_actions,EbayHome_Actions ebayhome_actions ) {
		this.common_actions = common_actions;
		this.ebayhome_actions = ebayhome_actions;
	}
	
	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
	  common_actions.goToUrl("https://www.ebay.com/");
	}

	@When("I click on Advanced Link")
	public void i_click_on_advanced_link() {
		ebayhome_actions.clickAdvancedLink();
	}

	@Then("I navigate to the Advanced Search Page")
	public void i_navigate_to_the_advanced_search_page() {
		String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
		String actUrl = common_actions.getCurrentPageUrl();
		if(!expUrl.equals(actUrl)){
			fail("Page does not navigate to expected page");
		}

	}

	@When("I search for {string}")
	public void i_search_for_iphone(String item) throws InterruptedException {
	ebayhome_actions.searchAnitem(item);
	ebayhome_actions.clickSearchButton();
	Thread.sleep(1000);
	}
	
	@Then("I validate at least {int} search items present")
	public void i_validate_at_least_search_items_present(int noOfResults) {
	 int itemCountInt = ebayhome_actions.getSearchItemsCount();
	 if(itemCountInt <= noOfResults)
		 fail("Item count is not expected!");
	 }

	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String item, String category) throws InterruptedException {
		 ebayhome_actions.searchAnitem(item);
		 ebayhome_actions.searchCategory(category);
		 ebayhome_actions.clickSearchButton();
		 Thread.sleep(1000);
	}

	@When("I click on {string}")
	public void i_click_on(String link) throws InterruptedException {
	 ebayhome_actions.clickOnLinkByText(link);
	 Thread.sleep(1000);
	}
	
	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String url, String title) {
	String actUrl = common_actions.getCurrentPageUrl();
	String actTitle = common_actions.getCurrentPageTitle();
	
	if(!actUrl.equals(url) && (!actTitle.equals(title))){
		fail("Page does not navigate to expected url.");
	}
	   
	}

}
