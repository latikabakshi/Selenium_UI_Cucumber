package com.productStore.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" },
                             dryRun = false, tags = {"@VerifydatapresentforalltypesofloansforLastWeek"}, monochrome = true)


public final class TestRunner extends AbstractTestNGCucumberTests{
  
    }







