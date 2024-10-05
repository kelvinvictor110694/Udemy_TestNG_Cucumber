package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Tablesorting {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".sort-icon.sort-descending")).click();
        List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> items2 = items.stream().map(value -> value.getText()).collect(Collectors.toList());
        List<String> items3 = items2.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(items2.equals(items3));

        //to do pagination
        List<String> price ;
        do {
            //to get the price of the items
            List<WebElement> itemspag = driver.findElements(By.xpath("//tr/td[1]"));
            price = itemspag.stream().filter(value -> value.getText().contains("Rice")).map(value -> getitemprice(value)).collect(Collectors.toList());
            price.stream().forEach(value -> System.out.println(value));

            if (price.size()<1){
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }

        }while (price.size()<1);
    }

    private static String getitemprice(WebElement value) {
        String price = value.findElement(By.xpath("following-sibling::td[1]")).getText();
        return price;
    }
}
