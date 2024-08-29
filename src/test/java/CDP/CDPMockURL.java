package CDP;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.fetch.Fetch;
import org.openqa.selenium.devtools.v127.network.Network;
import org.openqa.selenium.devtools.v127.network.model.Request;

import java.util.Optional;

public class CDPMockURL {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Fetch.enable(Optional.empty(),Optional.empty()));
        devTools.addListener(Fetch.requestPaused(), req ->{
            if (req.getRequest().getUrl().contains("shetty")){
                String newurl = req.getRequest().getUrl().replace("shetty","BadGuy");
                System.out.println(newurl);
                devTools.send(Fetch.continueRequest(req.getRequestId(),
                        Optional.of(newurl),Optional.of(req.getRequest().getMethod()),Optional.empty(),
                        Optional.empty(),Optional.empty()));
            }
        });
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn-primary")).click();
        
    }
}
