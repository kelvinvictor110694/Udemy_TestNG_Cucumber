package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dynamicdropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> countries = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        System.out.println("webelement is "+countries);
        System.out.println(countries.size());
        for (WebElement element:countries){
            String countryname = element.getText();
            System.out.println("country name is "+countryname);
            if (countryname.equalsIgnoreCase("india")){
                element.click();
                break;
            }
        }
    }
}
