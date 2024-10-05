package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot extends DriverSetup{



    public static String getScreenShot(String testCaseName) throws IOException {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+"/src/main/resources/Screenshots"+testCaseName+".jpg";
        File destination = new File(System.getProperty("user.dir")+"/src/main/resources/Screenshots/"+testCaseName+".jpg");
        FileUtils.copyFile(screenshot,destination);
        return path;
    }
}
