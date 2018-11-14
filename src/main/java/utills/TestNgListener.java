package utills;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNgListener implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("Test on start " + result.getName());
		Reporter.log("Test on start " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test on success  " + result.getName());
		Reporter.log("Test on success  " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("Test on failure " + result.getName());
		System.out.println("Test on failure " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test on skip " + result.getName());
		Reporter.log("Test on skip " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test on failure " + result.getName());
		Reporter.log("Test on failure " + result.getStatus());
	}

	public void onStart(ITestContext context) {
		System.out.println("Test on start " + context.getName());
		Reporter.log("Test on start " + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test on finish " + context.getName());
		Reporter.log("Test on finish " + context.getName());
	}

}
