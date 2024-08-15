package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //first validation
        driver.findElement(By.id("checkBoxOption3")).click();
        //second validation
        String checkboxlabel = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
        //third validation
        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        select.selectByVisibleText(checkboxlabel);
        //fourth validation
        driver.findElement(By.id("name")).sendKeys(checkboxlabel);
        //fifth validation
        driver.findElement(By.id("alertbtn")).click();
        String alertpopup = driver.switchTo().alert().getText();
        String[] alertmsg = alertpopup.split(" ");
        for (int i =0;i<alertmsg.length;i++) {
            if (alertmsg[i].contains(checkboxlabel)) {
                Assert.assertTrue(true);
            }
        }
    }
}
