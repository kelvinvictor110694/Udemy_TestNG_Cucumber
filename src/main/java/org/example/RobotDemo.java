package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotDemo {
    public static void main(String[] args) throws AWTException, InterruptedException {
        selectFile();
    }
    public static void selectFile() throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("input[name='userfile']")).click();
        Thread.sleep(10000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_ENTER);

    }
}
