package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jFile) {
		Configuration configuration = new Configuration(new File (System.getProperty("user.dir")+"\\src\\test\\resources\\reports"),"Adactin");
		configuration.addClassifications("Browser", "chromre");
		configuration.addClassifications("Sprint", "6");
		configuration.addClassifications("OS", "windows");
		
		List<String>jsonFiles=new ArrayList<String>();
		jsonFiles.add(jFile);
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
		reportBuilder.generateReports();
		
		

	}

}
 