package org.example;

import dev.failsafe.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Greencart {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] veggies = {"Cucumber","Beetroot"};
        int count = 0;
        List<String> vegies = Arrays.asList(veggies);

        List<WebElement> products = driver.findElements(By.xpath("//div/h4[@class='product-name']"));
        for (int i =0; i<products.size();i++){
            String productname = products.get(i).getText();
            String[] indivualproduct = productname.split( " ");
            if (vegies.contains(indivualproduct[0])) {
                driver.findElements(By.xpath("//div[@class='products']/div/div/button[@type='button']")).get(i).click();
                count++;
                if (vegies.size() == count) {
                    break;
                }
            }

        }
        driver.findElement(By.cssSelector(".cart-icon")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement((By.cssSelector("input.promoCode"))).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[text()='Apply']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
    }
}
