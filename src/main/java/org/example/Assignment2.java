package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice");
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Kelvin");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("PASSWORD");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Male");
        driver.findElement(By.xpath("//input[@value='option2']")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("10061994");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String successmsg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/strong")).getText();
        if (successmsg.contains("Success")) {
            Assert.assertTrue(true);
            System.out.println("test passed");

        } else {
            Assert.assertTrue(false);
            System.out.println("test failed");

        }
    }
}
