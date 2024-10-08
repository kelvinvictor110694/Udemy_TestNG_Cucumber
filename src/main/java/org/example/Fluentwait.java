package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class Fluentwait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div/button")).click();

        Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebElement button = fluentwait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//div[@id='finish']/h4"));
            }
        });
        System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());

    }
}
