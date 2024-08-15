package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment8 {
    public static void main(String[] args) {
        String country = "United States";
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("uni");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class ='ui-menu-item-wrapper']")));
        Actions action = new Actions(driver);

        List<WebElement> countries = driver.findElements(By.cssSelector("div[class ='ui-menu-item-wrapper']"));
        for (int i =0; i<countries.size();i++){
            if(countries.get(i).getText().contains(country)){
                action.moveToElement(countries.get(i)).click().build().perform();
            }
        }
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
    }
}
