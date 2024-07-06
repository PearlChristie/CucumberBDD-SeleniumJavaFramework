package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_Hooks {
	
	WebDriver driver;
	
	public Tagged_Hooks(common_Steps common) {
		driver = common.getDriver();
	}

	@Before(value = "@setCookies", order = 0)
	public void setCookies() {
		System.out.println("Scenario specific before hook - set cookies");
	}
	
	@After(value = "@Test", order = 0)
	public void testAfterHook() {
		System.out.println("Scenario specific after hook");
	}
	
}
