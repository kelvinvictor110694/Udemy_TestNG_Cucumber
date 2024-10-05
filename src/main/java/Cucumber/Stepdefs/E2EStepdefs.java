package Cucumber.Stepdefs;

import POM.CartPage;
import POM.HomePage;
import POM.LoginPage;
import Utils.WaitTime;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class E2EStepdefs {
    WebDriver driver;
    String product = "ZARA COAT 3";
    WaitTime wait = new WaitTime();

    @Given("I landed on the Ecommerce page")
    public void I_landed_on_the_Ecommerce_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client/");
    }

    @Given("^The user completes the login process with (.+)and (.+)$")
    public void completeLogin(String username, String password) {
        LoginPage login = new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();
    }

    @When("user cliks on add products to the cart")
    public void addProducts() throws InterruptedException {
        HomePage hm = new HomePage(driver);
        WaitTime.explicitWaitDisplayed(hm.sidebar());
        hm.getCardName(product);
        wait.explicitWaitInvisible(driver.findElement(By.cssSelector(".ng-animating")));
        wait.explicitWaitDisplayed(driver.findElement(By.id("toast-container")));
        wait.explicitWaitClickable(driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
    }

    @And("The user must see the added products to the cart")
    public void cartValidation() {
        CartPage cp = new CartPage(driver);
        wait.explicitWaitDisplayed(cp.cartpage());
        String cartProduct = driver.findElement(By.cssSelector("div[class='cartSection'] h3")).getText();
        Assert.assertEquals(cartProduct, product);
    }

    @Then("The user must complete the payment process successully")
    public void completeShoping() {
        CartPage cp = new CartPage(driver);
        driver.findElement(By.cssSelector("ul li:nth-child(3) button.btn.btn-primary")).click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector(".user__address input"))).click().sendKeys("indi").build().perform();
        wait.explicitWaitDisplayed(cp.countryResult());
        List<WebElement> country = driver.findElements(By.cssSelector("section.ta-results button"));
        country.stream().filter(value -> countryname(value).equalsIgnoreCase("india")).forEach(value -> value.click());
        driver.findElement(By.cssSelector(".action__submit")).click();
        wait.explicitWaitDisplayed(cp.thankYouPage());
        String thankYou = driver.findElement(By.cssSelector("h1.hero-primary")).getText();
        Assert.assertTrue(thankYou.contains("THANKYOU"));
    }

    public String countryname(WebElement element) {
        String cn = element.findElement(By.cssSelector("button span")).getText();
        return cn;
    }
}
