package POM;

import Utils.Logger;
import Utils.WaitTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends WaitTime {
    WebDriver driver ;

    @FindBy(id="userEmail")
    private WebElement usernameField;
    @FindBy(id = "userPassword")
    private WebElement passwordField;
    @FindBy(id ="login")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@aria-label='Incorrect email or password.']")
    private WebElement loginError;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username){
        usernameField.click();
        usernameField.clear();
        usernameField.sendKeys(username);
        Logger.addMessage("User has entered the username");
    }

    public void enterPassword(String password){
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void clickLogin(){
        loginButton.click();
    }

    public String getIncorrectError(){
        explicitWaitDisplayed(loginError);
        return loginError.getText();
    }
}
