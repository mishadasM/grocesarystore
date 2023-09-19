package com.obsqura.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.obsqura.constants.Constants;

public class ExtentReportNG {
	public static  ExtentReports extent;
	
	public static  ExtentReports GetReporterObject() {
		 ExtentSparkReporter reporter = new ExtentSparkReporter(Constants.Extent_ReportPath);
		 reporter.config().setReportName("Obsqura Automation Report");
		 reporter.config().setDocumentTitle("Test Results");
		 
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "Mandy Taak");
		 extent.setSystemInfo("Environment", "QA");
		 return extent;
	}
}
