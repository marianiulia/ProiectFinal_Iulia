package tests;

import driver.helper.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver driver = Driver.getInstance();

    @Before
    public void beforeTest() {
        driver.get("https://fentybeauty.com/");
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
