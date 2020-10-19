package com.productStore.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.stereotype.Component;

import com.cucumber.listener.Reporter;

@Component
public class ScreenshotAdder extends DriverClass {

	public static void addscreenshot() {
		
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			String src = ts.getScreenshotAs(OutputType.BASE64);
			Reporter.addScreenCaptureFromPath("data:image/jpeg;BASE64," + src);
		} catch (Exception e) {
			System.out.println("Exception while taking ScreenShot " + e.getMessage());
		}

	}
}
