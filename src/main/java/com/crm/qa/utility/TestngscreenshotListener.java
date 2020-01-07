package com.crm.qa.utility;

import java.io.IOException;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.crm.qa.base.Testbase;


public class TestngscreenshotListener extends Testbase implements ITestListener,ISuiteListener, IInvokedMethodListener{

	public TestngscreenshotListener() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("TC failed screenshot will be taken");
		try {
			takescreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub	
	}
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub	
	}
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub	
	}
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}
}
