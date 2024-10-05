package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,630)");
        System.out.println("Number of rows - "+driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr")).size());
        System.out.println("NUmber of Columns - "+driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr/th")).size());

        //second row elements
        List<WebElement> rowelement = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[3]/td"));
        for (int i=0;i<rowelement.size();i++){
            System.out.println(rowelement.get(i).getText());
        }
    }
}
