package Listeners_Study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log(" TC is fail please check TC",true);
		Reporter.log("fail TC name = "+result.getName(),true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("TC is passed",true);
		Reporter.log("Pass TC name = "+result.getName(),true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("check the dependend method",true);
		Reporter.log("Skipp TC name = "+result.getName(),true);
	}

}
