package ReTryTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnalyzer implements IRetryAnalyzer {

	int countForRetryAttempts = 0;

	int setMaxLimitForRetry= 3;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(!result.isSuccess())
		{
			if(countForRetryAttempts < setMaxLimitForRetry)
			{
				countForRetryAttempts++;
				return true;
			}
		}
		return false;
	}


}
