package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowDOM {

    private static ShadowDOM sd;
    private ShadowDOM(){}
    public static void getInstance(){
        if (sd ==null){
            sd = new ShadowDOM();
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.automationtesting.in/shadow-dom");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        SearchContext root = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        String text = root.findElement(By.cssSelector("#shadow-element")).getText();
        System.out.println(text);
        driver.close();
    }
}

