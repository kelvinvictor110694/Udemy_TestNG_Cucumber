package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Filterjavastream {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.cssSelector("a[href*='offers']")).click();
        Set<String> windowhandle = driver.getWindowHandles();
        Iterator<String> it = windowhandle.iterator();
        it.next();
        driver.switchTo().window(it.next());
        String item = "to";
        driver.findElement(By.id("search-field")).sendKeys(item);
        List<WebElement> items = driver.findElements(By.xpath("//td[1]"));

        List<WebElement> itemname = items.stream().filter(value -> value.getText().contains(item)).collect(Collectors.toList());
        if (items.size() == itemname.size()){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
    }
}
