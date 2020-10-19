package com.productStore.stepdefinitions;

import org.springframework.stereotype.Component;

import com.cucumber.listener.Reporter;
import com.productStore.utilities.DriverClass;
import com.productStore.utilities.LaunchBrowser;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

@Component
public class CommonSteps extends DriverClass {

	@Given("^Initialize the browser with \"([^\"]*)\"$")
	public void initialize_the_browser_with_Chrome(String browser) throws Throwable {
		LaunchBrowser b = new LaunchBrowser();
		b.openBrowser(browser);
	}

	@And("^Navigates to \"([^\"]*)\" Site$")
	public void navigates_to_something_site(String url) throws Throwable {
		Thread.sleep(2000);
		driver.get(url);
	}

	@And("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
		Reporter.addStepLog("Browser is closed successfully");
	}

}
