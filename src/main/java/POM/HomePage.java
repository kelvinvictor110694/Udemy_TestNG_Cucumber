package POM;

import Utils.DriverSetup;
import Utils.ExceluploadData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.PrintStream;
import java.util.List;

public class HomePage {
    WebDriver driver;

    @FindBy(id = "sidebar")
    private WebElement sidebar;
    @FindBy(css = "div[class='card-body']")
    private List<WebElement> cards;

    @FindBy(css = "button[routerlink='/dashboard/myorders']")
    private WebElement ordersButton;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement sidebar(){
        return sidebar;
    }

    public void getCardName(String ProductName){
        cards.stream().filter(value -> productName(value).contains(ProductName)).forEach(value -> clickAddtoCart(value));
    }

    public String productName(WebElement element) {
        String addtocartbutton = element.findElement(By.cssSelector("h5 b")).getText();
        return addtocartbutton;
    }

    public void clickAddtoCart(WebElement element) {
        element.findElement(By.xpath("//button[2]")).click();
    }
    public void orderButtonClick(){
        ordersButton.click();
    }

}
