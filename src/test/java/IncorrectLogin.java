import POM.LoginPage;
import Utils.DriverSetup;
import Utils.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IncorrectLogin extends DriverSetup{

    @Test(retryAnalyzer = Retry.class)
    public void validateIncorrectLogin(){
        LoginPage login = new LoginPage(driver);
        login.enterUsername("kelvin@test.com");
        login.enterPassword("P@535word");
        login.clickLogin();
        Assert.assertEquals(login.getIncorrectError(),"Incorrect email or password.");
    }
}
