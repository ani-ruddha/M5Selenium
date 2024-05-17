package genericLibraryOrUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/**
 * this class is for retry analyzer implementation
 * @author Aniruddha Das
 * @version 5.1.1
 */
public class RetryAnalyzerImplementationClass implements IRetryAnalyzer {

	int count=1;
	int retryCount =3;
	@Override
	public boolean retry(ITestResult result) {
		
		while(count<=retryCount)
		{
			count++;
			return true;
		}
		return false;
	}
	
	

}
