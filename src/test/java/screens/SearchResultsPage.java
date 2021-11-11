package screens;

import driver.helper.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Waiter;

public class SearchResultsPage {
    private WebDriver driver = Driver.getInstance();
    Waiter wait = new Waiter();

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }
}
