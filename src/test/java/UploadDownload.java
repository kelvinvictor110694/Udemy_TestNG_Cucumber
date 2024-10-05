import Utils.ExceluploadData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class UploadDownload {
    static WebDriver driver;
    public static void explicitwait(String locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
    }

    public static void invisiblewait(String locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
    }

    public static void uploaddownload(){
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/upload-download-test/");
        driver.manage().window().maximize();
        String downloadButton = "button[id='downloadButton']";
        explicitwait(downloadButton);
        driver.findElement(By.cssSelector(downloadButton)).click();
        String uploadButton = "input[id='fileinput']";
        driver.findElement(By.cssSelector(uploadButton)).sendKeys("/Users/kelvinvictor/Downloads/download.xlsx");
        String toastmsg ="div[class='Toastify__toast-body'] div:nth-child(2)";
        explicitwait(toastmsg);
        String message = driver.findElement(By.cssSelector(toastmsg)).getText();
        System.out.println(message);
        Assert.assertEquals(message,"Updated Excel Data Successfully.");
        invisiblewait(toastmsg);
        String price =null;
        List<WebElement> products = driver.findElements(By.xpath("//div[@id='cell-2-undefined']/div"));
        for (int i =0;i<products.size();i++){
            if (products.get(i).getText().equalsIgnoreCase("Apple")){
                 price = products.get(i).findElement(By.xpath("parent::div/following-sibling::div[2]")).getText();
            }
        }
        System.out.println(price);

        driver.close();
    }


    public static void main(String[] args) throws IOException {
        uploaddownload();
        List<Integer> list = ExceluploadData.getrowno("Price");
        System.out.println(list.toString());
    }
}
