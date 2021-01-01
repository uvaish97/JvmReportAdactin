package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepdefinition"}, monochrome=true,dryRun=false,plugin= {"pretty","json:src\\test\\resources\\reports\\AdactinReport.json"})
public class TestRunner {
	@AfterClass
	public static void afterClass() {
//	JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\report\\AdactinReport.json");
	JVMReport.generateJVMReport("C:\\Users\\Uvaish\\eclipse-workspace\\Cucumber2\\src\\test\\resources\\reports\\AdactinReport.json");

	}
 	

}
