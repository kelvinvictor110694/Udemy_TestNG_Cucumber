package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Month;
import java.util.HashMap;

public class Calander {
    public static void main(String[] args) {
        datePicker();
    }

    public static void datePicker(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("datepicker")).sendKeys("11/06/1994");


    }

    public static Month getMonth(String month){
        HashMap<String, Month> mapmonth = new HashMap<String,Month>();
        mapmonth.put("January",Month.JANUARY);
        mapmonth.put("February",Month.FEBRUARY);
        mapmonth.put("March",Month.MARCH);
        mapmonth.put("April",Month.APRIL);
        mapmonth.put("May",Month.MAY);
        mapmonth.put("June",Month.JUNE);
        mapmonth.put("July",Month.JULY);
        mapmonth.put("August",Month.AUGUST);
        mapmonth.put("September",Month.SEPTEMBER);
        mapmonth.put("October",Month.OCTOBER);
        mapmonth.put("November",Month.NOVEMBER);
        mapmonth.put("December",Month.DECEMBER);

        Month wantedMonth = mapmonth.get(month);
        if (wantedMonth == null){
            System.out.println("Invalid Month");
        }
        return wantedMonth;
    }
}
