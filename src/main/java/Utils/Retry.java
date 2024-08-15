package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int count =0;
    int maxretry = 1;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<maxretry){
            count++;
            return true;
        }
        return false;
    }
}
