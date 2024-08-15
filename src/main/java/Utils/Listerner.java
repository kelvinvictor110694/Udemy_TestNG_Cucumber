package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listerner extends DriverSetup implements ITestListener{
    ExtentReports report = ExtentReport.extentSetup();
    ExtentTest extendtest;
    static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

    public static ExtentTest getInstance(){
        return test.get();
    }

    @Override
    public void onTestStart(ITestResult result) {
        extendtest = report.createTest(result.getMethod().getMethodName());
        test.set(extendtest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS,"Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String filename = null;
        try {
             filename = Screenshot.getScreenShot(result.getMethod().getMethodName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.get().fail(result.getThrowable());
        test.get().log(Status.FAIL,"Failed");
        test.get().addScreenCaptureFromPath(filename);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP,"Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
        report.flush();
    }
}
