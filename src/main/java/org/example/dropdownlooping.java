package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dropdownlooping {
    public static void main(String[] args) {
       /* WebDriver driver = new ChromeDriver();
        ChromeOptions chropt = new ChromeOptions();
        driver.manage().window().maximize();
        driver.get("http://spicejet.com");
        driver.findElement(By.cssSelector("div[class='css-1dbjc4n'] div div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'] div[class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
*/
        int seats = 5;
        int i =1;
        while (i<seats){
            System.out.println("selected");
            i++;
        }
    }
}
