package com.productStore.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cucumber.listener.ExtentProperties;
import com.productStore.utilities.DriverClass;
//import com.productStore.utilities.TestDataPath;

import cucumber.api.testng.TestNGCucumberRunner;;



@RestController
@CrossOrigin("*")
public class Controller extends DriverClass {
	Logger log = Logger.getLogger(Controller.class);
	ExtentProperties extentProperties = ExtentProperties.INSTANCE;

	@RequestMapping("/productStore")
	public String soi() throws Throwable {

		TestNGCucumberRunner t = new TestNGCucumberRunner(com.productStore.stepdefinitions.TestRunner.class);
		//extentProperties.setReportPath(TestDataPath.staticFolderPath + "/Report/soi_" + getDateTime() + ".html");

		try {
			t.runCukes();
		} catch (Exception e) {

			return "false";

		}

		return "true";
	}

}
