package POM;

import Utils.WaitTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage extends WaitTime {
    WebDriver driver;
    @FindBy(css = "div[class='cartSection'] h3")
    private WebElement cartpage;
    @FindBy(css = "section.ta-results")
    private WebElement countryResult;
    @FindBy(css = "h1.hero-primary")
    private WebElement thankyoupage;
    @FindBy(css = "h1.ng-star-inserted")
    private WebElement orderpage;
    @FindBy(css = "tbody tr td:nth-child(3)")
    private List<WebElement> orderItems;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement cartpage() {
        return cartpage;
    }

    public WebElement countryResult() {
        return countryResult;
    }

    public WebElement thankYouPage() {
        return thankyoupage;
    }

    public boolean orderItemName(String productName) {
        explicitWaitDisplayed(orderpage);
        Boolean ordernamepresent = orderItems.stream().anyMatch(value -> value.getText().contains(productName));
        return ordernamepresent;
    }


}
