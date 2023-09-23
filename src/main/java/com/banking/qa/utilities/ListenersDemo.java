package com.banking.qa.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.banking.qa.base.Base;

public class ListenersDemo extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution is started " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		Utils.takeImage(driver, result.getName());
	}

	public void onTestSkipped(ITestResult result) {

	}

}
