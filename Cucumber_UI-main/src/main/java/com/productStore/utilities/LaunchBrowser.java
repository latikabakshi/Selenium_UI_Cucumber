package com.productStore.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Component;

import io.github.bonigarcia.wdm.WebDriverManager;
@Component
public class LaunchBrowser extends DriverClass {

	 public WebDriver openBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) { 
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized"); 
			options.addArguments("enable-automation"); 
			options.addArguments("--no-sandbox"); 
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-browser-side-navigation"); 
			options.addArguments("--disable-gpu"); 
			driver = new ChromeDriver(options); 
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			System.out.println("Chrome browser is launched successfully");
		}

		else if (browser.equalsIgnoreCase("firefox")) { 
			
			   
			 WebDriverManager.firefoxdriver().setup();
			 System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
			 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
			
			
	        driver = new FirefoxDriver();
	        System.out.println("Firefox browser is launched successfully");
	          
			    }    
		
		return null;

		}
}
