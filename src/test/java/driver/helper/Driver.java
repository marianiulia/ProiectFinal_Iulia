package driver.helper;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){

    }

    private static WebDriver driver = null;

    public static WebDriver getInstance(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }
}
