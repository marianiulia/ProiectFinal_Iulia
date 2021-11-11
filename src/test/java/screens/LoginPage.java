package screens;

import driver.helper.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waiter;

public class LoginPage {
    private WebDriver driver = Driver.getInstance();
    Waiter wait = new Waiter();
    Actions action = new Actions(driver);

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='input-email-login']")
    private WebElement emailLoginField;

    @FindBy(xpath = "//input[@id='input-password-login']")
    private WebElement passwordField;

    @FindBy(xpath =  "//a[@class='promo-bar__close js-close icon-btn icon-btn--close']")
    private WebElement freeShippingMessageExitButton;

    @FindBy(xpath = "//button[@class='btn btn--full btn btn--primary']")
    private WebElement signInButton;

    @FindBy(xpath = "//p[@class='red p1']")
    private WebElement wrongPasswordMessage;


    public LoginPage enterEmail(String email){
        wait.waitForElementToBeVisible(emailLoginField);
        emailLoginField.sendKeys(email);
        return this;
    }

    public LoginPage enterPassword(String password){
        wait.waitForElementToBeVisible(passwordField);
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage closeFreeShippingMessage(){
        freeShippingMessageExitButton.click();
        return this;
    }

    public AccountPage clickSignInButton(){     // returns new page (Account Page)
//        wait.waitForElementToBeClickable(signInButton);
        action.moveToElement(signInButton);
        wait.waitForElementToBeClickable(signInButton);
        signInButton.click();
        return new AccountPage();
    }

    public LoginPage checkWrongPasswordMessage(String expectedPasswordErrorMessage){
        String actualPasswordErrorMessage = wrongPasswordMessage.getText();
        Assert.assertEquals("Password error is incorrect.",expectedPasswordErrorMessage, actualPasswordErrorMessage);
        return this;
    }


}
