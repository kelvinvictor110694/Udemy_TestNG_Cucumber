package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Invokemultipletabs {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentid = it.next();
        driver.switchTo().window(it.next());
        driver.get("https://rahulshettyacademy.com/");
        WebElement course = driver.findElement(By.cssSelector("div[class*='courses-block']:nth-child(1)"));
        String text = course.findElement(By.xpath("//h2/a")).getText();
        driver.switchTo().window(parentid);
        WebElement nameBox = driver.findElement(By.xpath("//input[@name='name']"));
        nameBox.sendKeys(text);
        System.out.println(nameBox.getRect().getHeight());
        File ss = nameBox.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File(System.getProperty("user.dir")+"/src/main/resources/partialscreenshot.jpg"));
    }

}
