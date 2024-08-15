package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class Brokenlinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> element = driver.findElements(By.xpath("//div[@id='gf-BIG'] //a"));


        for (int i =1;i<element.size();i++) {
            String url = element.get(i).getAttribute("href");
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
            urlConnection.setRequestMethod("HEAD");
            urlConnection.connect();
            int code = urlConnection.getResponseCode();
            softAssert.assertTrue(code<400,"Link is broken - " +url);
        }
        softAssert.assertAll();
    }


    public void imageBroken() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("test.com");
        List<WebElement> images = driver.findElements(By.xpath("//img"));

        for (int i=0; i<images.size();i++){
            String imagepath = images.get(i).getAttribute("src");
            HttpURLConnection urlConnection = (HttpURLConnection)  new URL(imagepath).openConnection();
            urlConnection.setRequestMethod("HEAD");
            urlConnection.connect();
            int code = urlConnection.getResponseCode();
        }
    }
}
