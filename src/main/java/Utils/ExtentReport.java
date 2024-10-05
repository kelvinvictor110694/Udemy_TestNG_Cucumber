package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport extends DriverSetup{

    public static ExtentReports extentSetup(){
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/src/main/resources/Reports/ExtentReport.html");
        extentSparkReporter.config().setDocumentTitle("Udemy Extent Report");
        extentSparkReporter.config().setReportName("Udemy");
        ExtentReports report = new ExtentReports();
        report.attachReporter(extentSparkReporter);
        report.setSystemInfo("Tester", "Kelvin");
        report.setSystemInfo("Browser","Chrome");
        return report;
    }
}
