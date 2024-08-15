import POM.CartPage;
import POM.HomePage;
import POM.LoginPage;
import Utils.DriverSetup;
import Utils.JsonDataReader;
import Utils.WaitTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.*;


public class Framework extends DriverSetup {
    String product = "ZARA COAT 3";
    WaitTime wait = new WaitTime();
    JsonDataReader json = new JsonDataReader();

   // @Test(priority = 1, groups = {"Smoke"}, dataProvider = "jsonloginCredentials")
    public void login(HashMap<String, String> input) {
        LoginPage login = new LoginPage(driver);
        login.enterUsername(input.get("email"));
        login.enterPassword(input.get("password"));
        login.clickLogin();
    }

    @Test(priority = 1)
    public void logins() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("kelvin@test.com");
        login.enterPassword("P@55word");
        login.clickLogin();
    }

    @Test(priority = 2)
    public void addToCart() throws InterruptedException {
        HomePage hm = new HomePage(driver);
        wait.explicitWaitDisplayed(hm.sidebar());
        hm.getCardName(product);
 /*       for (int i=0; i<cards.size();i++){
            if (cards.get(i).findElement(By.cssSelector("h5 b")).getText().contains(product)) {
                //cards.get(i).findElement(By.cssSelector("button[text()=' Add to Cart']")).click();
                cards.get(i).findElement(By.xpath("//button[2]")).click();
            }
} */
        wait.explicitWaitInvisible(driver.findElement(By.cssSelector(".ng-animating")));
        wait.explicitWaitDisplayed(driver.findElement(By.id("toast-container")));
        wait.explicitWaitClickable(driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
    }


    @Test(priority = 3)
    public void cartPageValidation() {
        CartPage cp = new CartPage(driver);
        wait.explicitWaitDisplayed(cp.cartpage());
        String cartProduct = driver.findElement(By.cssSelector("div[class='cartSection'] h3")).getText();
        Assert.assertEquals(cartProduct, product);
    }

    @Test(priority = 4)
    public void checkoutValidation() {
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

    @Test(priority = 5, dependsOnMethods = "checkoutValidation")
    public void orderValidation() {
        HomePage hm = new HomePage(driver);
        CartPage cp = new CartPage(driver);
        hm.orderButtonClick();
        cp.orderItemName(product);
    }

    @DataProvider
    public Object[][] loginCredentials() {
        Object[][] obj = {{"kelvin@test.com", "P@55word", "ZARA COAT 3"}, {"kelvin@ttest.com", "P@55word", "ADIDAS ORIGINAL"}};
        return obj;
    }

    @DataProvider
    public Object[][] maploginCredentials() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("email", "kelvin@test.com");
        map.put("password", "P@55word");
        map.put("product", "ZARA COAT 3");

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("email", "kelvin@ttest.com");
        map2.put("password", "P@55word");
        map2.put("product", "ADIDAS ORIGINAL");

        return new Object[][] {{map},{map2}};
    }

    @DataProvider
    public Object[][] jsonloginCredentials() throws IOException {

        List<HashMap<String,String>> data = json.getJsonData();
        return new Object[][] {{data.get(0)},{data.get(1)}};
    }



}
