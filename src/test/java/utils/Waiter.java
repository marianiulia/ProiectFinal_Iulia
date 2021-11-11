package utils;

import driver.helper.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    private WebDriver driver = Driver.getInstance();
    WebDriverWait wait = new WebDriverWait(driver, 15);

    public void waitForElementToBeClickable(WebElement webElement){
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitForElementToBeVisible(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
