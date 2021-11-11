package screens;

import driver.helper.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waiter;
import java.util.ArrayList;
import java.util.List;


public class AccountPage {
    private WebDriver driver = Driver.getInstance();
    Waiter wait = new Waiter();

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='a1 account-navigation__link']")
    private List<WebElement> accountActionButton;

    public AccountPage clickLogoutButton(){
        accountActionButton.get(1).click();
        return this;
    }

}
