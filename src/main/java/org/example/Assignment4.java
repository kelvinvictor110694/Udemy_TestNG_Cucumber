package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windowname = driver.getWindowHandles();
        Iterator<String> i =windowname.iterator();
        String parent = i.next();
        String child = i.next();
        driver.switchTo().window(child);
        //going to 2nd window
        String childwindowtext = driver.findElement(By.tagName("h3")).getText();
        System.out.println(childwindowtext);
        driver.switchTo().window(parent);
        //going back to 1st window
        String parentwindowtext = driver.findElement(By.xpath("//div/h3")).getText();
        System.out.println(parentwindowtext);

    }
}
