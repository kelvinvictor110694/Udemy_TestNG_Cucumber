package CDP;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;

public class CDPwoMobileview {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        Map metrics =  new HashMap<>();
        metrics.put("width", 375);
        metrics.put("height", 812);
        metrics.put("deviceScaleFactor", 50);
        metrics.put("mobile", true);
        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", metrics);
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.className("navbar-toggler-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Library")).click();
    }
}
