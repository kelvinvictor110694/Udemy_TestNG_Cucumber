package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class WindowAuthentication {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href$='/basic_auth']")).click();

    }
}
