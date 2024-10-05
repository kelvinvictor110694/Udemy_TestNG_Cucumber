package CDP;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.network.Network;
import org.openqa.selenium.devtools.v127.network.model.Request;
import org.openqa.selenium.devtools.v127.network.model.Response;

import java.util.Optional;

public class CDPResponse {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));

        devTools.addListener(Network.requestWillBeSent(), req->{
            Request request = req.getRequest();
            System.out.println(request.getUrl());
        });

        devTools.addListener(Network.responseReceived(),res-> {
            Response resp = res.getResponse();
            //System.out.println(resp.getUrl());
            System.out.println(resp.getStatus());
        });

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }
}
