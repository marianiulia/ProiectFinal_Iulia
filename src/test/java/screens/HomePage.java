package screens;

import driver.helper.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waiter;

import java.util.List;

public class HomePage {
    private WebDriver driver = Driver.getInstance();
    Waiter wait = new Waiter();
    JavascriptExecutor je = (JavascriptExecutor) driver;    // instance of Javascript executor

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='header-account-links__link header__icons__item__link header__icons__item__link--account n1']")
    private WebElement accountButton;

    @FindBy(xpath = "//a[@class='js-toggle-search-bar icon-btn icon-btn--search']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@class='search-bar__input-el n2 js-search-bar']")
    private WebElement searchBarTextbox;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//input[@class='backToShop glDefaultBtn']")
    private WebElement getToShoppingButton;

    @FindBy(xpath = "//div[@class='product-card__image product-card__image--hover']")
    private List<WebElement> homepageProduct;

    public HomePage acceptCookies(){
        wait.waitForElementToBeVisible(acceptCookiesButton);
        acceptCookiesButton.click();
        return this;
    }

    public HomePage clickGetToShoppingButton(){
        wait.waitForElementToBeVisible(getToShoppingButton);
        getToShoppingButton.click();
        return this;
    }

    public LoginPage clickAccountButton(){
        wait.waitForElementToBeVisible(accountButton);
        accountButton.click();
        return new LoginPage();
    }

    public HomePage clickSearchButton(){
        wait.waitForElementToBeClickable(searchButton);
        searchButton.click();
        return this;
    }

    public HomePage enterProductName(String productName){
        searchBarTextbox.sendKeys(productName);
        return this;
    }

    public SearchResultsPage pressEnter(){
        searchBarTextbox.sendKeys(Keys.ENTER);
        return new SearchResultsPage();
    }

    // scroll to listed products
    public HomePage scrollToProduct(){
                je.executeScript("arguments[0].scrollIntoView(true);",homepageProduct.get(1));
        return this;
    }

    // view selected product details -- in this case, second product
    public ViewProductPage clickOnProduct(){
        wait.waitForElementToBeVisible(homepageProduct.get(1));
        wait.waitForElementToBeClickable(homepageProduct.get(1));
        homepageProduct.get(1).click();
        return new ViewProductPage();
    }


}
