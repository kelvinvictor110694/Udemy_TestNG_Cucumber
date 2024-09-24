package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class BrowserNotification {
    public static void main(String[] args) {
        browserNot();
    }
    public static void browserNot(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",Map.of("profile.default_content_setting_values.notifications",2));
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.justdial.com/");
        driver.manage().window().maximize();
    }
}
