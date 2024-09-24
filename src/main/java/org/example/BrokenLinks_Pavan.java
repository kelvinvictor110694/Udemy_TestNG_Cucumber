package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks_Pavan {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int brokenlinks =0;

        for (WebElement element:links){
            String url = element.getAttribute("href");
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
            urlConnection.setRequestMethod("HEAD");
            urlConnection.connect();
            int code = urlConnection.getResponseCode();
            if (code >= 400)
                brokenlinks++;
        }
        System.out.println(brokenlinks);
        driver.quit();
    }
}
