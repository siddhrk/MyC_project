package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{

	
	@Override
	public void onTestSuccess(ITestResult result) {
		 Reporter.log("sorry your TC is failed",true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestStart(ITestResult result) {
		 Reporter.log("congrates your TC is passed",true);
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		 Reporter.log("your TC is skipped",true);
		ITestListener.super.onTestSkipped(result);
	}
}
