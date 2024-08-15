package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Scrolling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
        int total = 0;
        List<WebElement> amount = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
        for (int i = 0; i < amount.size(); i++) {
            String count = amount.get(i).getText();
            int total2 = Integer.parseInt(count);
            total = total + total2;
        }
        String totalamount = driver.findElement(By.cssSelector(".totalAmount")).getText();
        String[] split = totalamount.split(":");
        int tot = Integer.parseInt(split[1].trim());
        Assert.assertEquals(tot , total);



    }
}
