import Utils.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon  {

    @Test
    public void driverSetup(){
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("div span[class='nav-line-2 ']"))).build().perform();
        driver.findElement(By.xpath("//span[text()='Your Account']")).click();
    }
}
