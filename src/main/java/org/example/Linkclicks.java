package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Linkclicks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement columnelement = driver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
        List<WebElement> anchortags = columnelement.findElements(By.tagName("a"));
        int size = columnelement.findElements(By.tagName("a")).size();
        Actions action = new Actions(driver);
        for (int i=1;i<size;i++){
            action.moveToElement(anchortags.get(i)).keyDown(Keys.COMMAND).click().build().perform();
        }

        Set<String> windowhandles = driver.getWindowHandles();
        Iterator<String> it = windowhandles.iterator();
        for (int i =0; i<windowhandles.size();i++){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}
