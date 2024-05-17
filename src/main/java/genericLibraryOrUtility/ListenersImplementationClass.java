package genericLibraryOrUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
/**
 * this is the listeners implementation class to monitor and capture the tc and it's
 * result
 * @author Aniruddha Das
 * @version 5.1.1
 */
public class ListenersImplementationClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	String methodName =	result.getMethod().getMethodName();
	Reporter.log(methodName + "execution Starts!");//to show result in report
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName =	result.getMethod().getMethodName();
		Reporter.log(methodName + "execution successfull!!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName =	result.getMethod().getMethodName();
		Reporter.log(methodName + "execution failed!!");
		
		WebDriverOrSeleniumUtility WUTIL = new WebDriverOrSeleniumUtility();
		try {
			WUTIL.captureScreenshot(methodName);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName =	result.getMethod().getMethodName();
		Reporter.log(methodName + "execution Skiped");
	}

	

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
}
