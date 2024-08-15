package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativelocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //above example
        WebElement textbox = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(textbox)).getText());

        //left of
        WebElement leftof = driver.findElement(By.cssSelector("div[class='form-check'] label[class='form-check-label']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(leftof)).click();

        //below example
        WebElement label = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(label)).click();
    }
}
