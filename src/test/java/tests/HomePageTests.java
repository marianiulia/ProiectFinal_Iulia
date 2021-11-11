package tests;

import org.junit.Test;
import screens.HomePage;

public class HomePageTests extends BaseTest {

    @Test
    public void viewProductDetailsTest(){       // click on second product to view details
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
        homePage.clickGetToShoppingButton();

        homePage.scrollToProduct();
        homePage.clickOnProduct();
    }

    @Test
    public void searchProductTest(){
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
        homePage.clickGetToShoppingButton();
        homePage.clickSearchButton();
        homePage.enterProductName("lipstick");

        homePage.pressEnter();

        driver.navigate().back();       // go back to previous page (home page)
    }

}
