package com.productStore.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;


public class DriverClass {

	public static WebDriver driver;
	
	
	public static String getDateTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
        return df.format(new Date());
    }
	
	

	}
	

