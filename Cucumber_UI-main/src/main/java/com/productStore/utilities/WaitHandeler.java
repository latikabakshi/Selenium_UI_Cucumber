package com.productStore.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;


@Component
public class WaitHandeler extends DriverClass {

	public static void imp_Wait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void waitUntilliSAlertPresent(int timeinSeconds){
		WebDriverWait wait=new WebDriverWait(driver,timeinSeconds);
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
