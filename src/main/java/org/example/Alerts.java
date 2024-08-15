package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {
    public static void main(String[] args) {
        String name = "Tester";
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.name("enter-name")).sendKeys(name);
        driver.findElement(By.cssSelector("input[value='Alert']")).click();
        String alertmsg = driver.switchTo().alert().getText();
        if (alertmsg.contains(name)) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
        driver.switchTo().alert().accept();

    }
}
