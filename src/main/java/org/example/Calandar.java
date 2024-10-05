package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Calandar {
    public static void main(String[] args) throws InterruptedException {
        String date = "11";
        String month = "6";
        String year = "2027";
        String[] dates = {month,date,year};

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.findElement(By.linkText("Top Deals")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        Iterator<String> it = windowhandles.iterator();
        it.next();
        driver.switchTo().window(it.next());

        driver.findElement(By.cssSelector(".react-date-picker__calendar-button")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        List<WebElement> years = driver.findElements(By.cssSelector(".react-calendar__decade-view__years__year"));
        for (int i=0;i<years.size();i++){
            if (years.get(i).getText().contains(year)){
                years.get(i).click();
                break;
            }
        }

        List<WebElement> months = driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"));
        int nummonth = Integer.parseInt(month);
        months.get(nummonth-1).click();

        List<WebElement> days = driver.findElements(By.cssSelector(".react-calendar__month-view__days__day"));
        for (int i=0;i<days.size();i++){
            if (days.get(i).getText().contains(date)){
                days.get(i).click();
            }
        }

        List<WebElement> finaldate = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for (int i=0; i<finaldate.size();i++){
            Assert.assertEquals(finaldate.get(i).getAttribute("value"),dates[i]);
        }
    }
}
