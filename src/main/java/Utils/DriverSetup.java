package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;


public class DriverSetup {
    public static WebDriver driver;
    static String browser = null;
    @BeforeClass(alwaysRun = true)
    public void driverSetup() throws IOException {
        chooseBrowser();
    }

    public void chooseBrowser() throws IOException {
         browser = System.getProperty("browser") !=null ? System.getProperty("browser") : PropertyReader.getProperty("browser");
        if (browser.contains("Chrome"))
            startChromeDriver();
        else
            startFirefoxDriver();
    }

    @AfterClass(alwaysRun = true)
    public void driverTearDown(){
        tearDown();
    }

    public void startChromeDriver() {
        ChromeOptions options = new ChromeOptions();
         //browser = System.getProperty("browser");
        if (browser.contains("headless")) {
            options.addArguments("headless");
        }else {
            driver = new ChromeDriver(options);
            Dimension dim = new Dimension(1440, 900);
            driver.manage().window().setSize(dim);
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/client");
        }
    }

    public void startFirefoxDriver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client");
    }

    public void tearDown(){
        driver.close();
    }
}
