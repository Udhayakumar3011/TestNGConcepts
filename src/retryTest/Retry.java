package retryTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private static int maxTry = 5;
	private int count = 0;

	@Override
	public boolean retry(ITestResult result) {
		if (!result.isSuccess()) {
			// retry
			if (count < maxTry) {
				count++;
				result.setStatus(ITestResult.FAILURE); // Mark as Failed test
				return true;
			} else {
				result.setStatus(ITestResult.FAILURE); // Force Stop
			}
		} else {
			result.setStatus(ITestResult.SUCCESS);
		}

		return false; // Execution Stopped
	}

}
