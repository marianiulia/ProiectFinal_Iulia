package screens;

import driver.helper.Driver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waiter;

import javax.swing.text.View;

public class ViewProductPage {
    private WebDriver driver = Driver.getInstance();
    Waiter wait = new Waiter();

    public ViewProductPage() {
        PageFactory.initElements(driver, this);
    }

    //add to cart

    @FindBy(xpath = "//button[@class='btn btn--full uppercase product-hero__add-cta btn--primary']")
    private WebElement addToCartButton;

    public ViewProductPage addProductToCart() {

        wait.waitForElementToBeVisible(addToCartButton);
        addToCartButton.click();
        wait.waitForElementToBeClickable(addToCartButton);
        return this;
    }
}
