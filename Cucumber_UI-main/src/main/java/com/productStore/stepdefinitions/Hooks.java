package com.productStore.stepdefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.productStore.utilities.DriverClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;







public class Hooks extends DriverClass {
	Scenario scenario = null; 
	
	public static Logger log = LogManager.getLogger(Hooks.class.getName());

	@Before
	public void initbrowser() {
		log.info("browser is launched");
		
	}
		
	

    @After
	public void embedScreenshotafter(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			log.info("Test case failed. See screenshot for reference");

			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				String src = ts.getScreenshotAs(OutputType.BASE64);
				Reporter.addScreenCaptureFromPath("data:image/jpeg;BASE64," + src);
			} catch (Exception e) {
				System.out.println("Exception while taking ScreenShot " + e.getMessage());
			}

		}
		try {
			driver.quit();
		} finally {
			driver.quit();
		}
	}

}
