package com.obsqura.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.obsqura.tests.BaseTest;
import com.obsqura.utilities.ExtentReportNG;
import com.obsqura.utilities.PageUtility;

public class Listeners   implements ITestListener {

	ExtentReports extent =ExtentReportNG.GetReporterObject();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		String testCaseName = result.getMethod().getMethodName();
		try {
			test.addScreenCaptureFromPath(PageUtility.GetScreenshot(testCaseName), testCaseName );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

	
}
