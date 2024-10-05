package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        String username = driver.findElement(By.cssSelector("div p b:nth-child(1) i")).getText();
        String password = driver.findElement((By.cssSelector("div p b:nth-child(2) i"))).getText();

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        WebElement element = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select select = new Select(element);
        select.selectByVisibleText("Consultant");

        driver.findElement(By.cssSelector("input[type='checkbox']")).click();

        driver.findElement(By.id("signInBtn")).click();

        //2nd page
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("ProtoCommerce Home")));

        List<WebElement> products = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
        for (int i=0;i<products.size(); i++){
            products.get(i).click();
        }

        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();

    }
}

