package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void main(String[] args) throws IOException {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        String path = System.getProperty("user.dir");
        System.out.println(path);
        File photo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(photo,new File(System.getProperty("user.dir")+"/src/main/resources/screenshot.jpg"));
    }
}
