package CDP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.emulation.Emulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GeoLocation {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        Map<String,Object> coordinates = new HashMap<String,Object>();
        coordinates.put("latitude",40);
        coordinates.put("longitude",3);
        coordinates.put("accuracy",1);
        driver.executeCdpCommand("Emulation.setGeolocationOverride",coordinates);
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("restaurants near me", Keys.ENTER);

    }
}
