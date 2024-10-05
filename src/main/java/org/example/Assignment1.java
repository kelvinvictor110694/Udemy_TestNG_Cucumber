package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //1st assertion
        driver.findElement(By.xpath("//input[@value='option1']")).click();
        boolean firstcheckboxselect = driver.findElement(By.xpath("//input[@value='option1']")).isSelected();
        Assert.assertTrue(firstcheckboxselect);
        //uncheck the 1st checkbox
        driver.findElement(By.xpath("//input[@value='option1']")).click();
        boolean firstcheckboxunselect = driver.findElement(By.xpath("//input[@value='option1']")).isSelected();
        Assert.assertFalse(firstcheckboxunselect);

        //2nd assertion
        int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(size);

        //finding is enabled via code
        String attribute = driver.findElement(By.id("Div1")).getAttribute("style");
        if (attribute.contains("1")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }


    }
}
