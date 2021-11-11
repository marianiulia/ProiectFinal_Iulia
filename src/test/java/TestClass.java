import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fentybeauty.com/");
        driver.manage().window().maximize();

        WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        WebElement accountButton = driver.findElement(By.xpath("//a[@class='header-account-links__link header__icons__item__link header__icons__item__link--account n1']"));
        WebElement getToShoppingButton = driver.findElement(By.xpath("//input[@class='backToShop glDefaultBtn']"));

        acceptCookiesButton.click();
        getToShoppingButton.click();
        accountButton.click();

        Thread.sleep(10000);
        driver.quit();
        System.out.println("Test successful");
    }
}
