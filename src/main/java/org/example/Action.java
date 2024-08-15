package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.in");

        //Hover over a element
        WebElement accounts = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        Actions action = new Actions(driver);
        action.moveToElement(accounts).build().perform();

        //Input keys in capital letters
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        action.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

        //Double click
        action.moveToElement(searchbox).doubleClick().build().perform();

        //Right click
        action.moveToElement(accounts).contextClick().build().perform();

    }
}
