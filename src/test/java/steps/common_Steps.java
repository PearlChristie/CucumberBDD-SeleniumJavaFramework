package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class common_Steps {

	private WebDriver driver;
	
	@Before(order = 1)
	//execute before each test scenario in feature file
	public void Setup() {
		driver = new ChromeDriver();
		System.out.println("Global specific - before hook");
	}
	
	@After(order = 1)
	//after each test scenario in feature file
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(1000);
		System.out.println("Global specific - after hook");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
