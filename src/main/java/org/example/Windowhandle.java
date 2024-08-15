package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windowhandle {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.className("blinkingText")).click();

        Set<String> windownames=driver.getWindowHandles();
        System.out.println(windownames);
        Iterator<String> i = windownames.iterator();
        String parentid = i.next();
        String childId = i.next();
        System.out.println(parentid+ ","+childId);
        driver.switchTo().window(childId);
        String mailid = driver.findElement(By.cssSelector("p strong a")).getText();
        driver.switchTo().window(parentid);
        driver.findElement(By.id("username")).sendKeys(mailid);
    }
}
