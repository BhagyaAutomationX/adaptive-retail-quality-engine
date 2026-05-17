package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryHandler
implements IRetryAnalyzer {

    int currentExecutionCount = 0;

    int maximumRetryLimit = 2;

    @Override
    public boolean retry(
            ITestResult executionResult) {

        if(currentExecutionCount < maximumRetryLimit) {

            currentExecutionCount++;

            return true;
        }

        return false;
    }
}