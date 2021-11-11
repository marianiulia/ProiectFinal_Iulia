package tests;

import org.junit.Test;
import screens.AccountPage;
import screens.HomePage;
import screens.LoginPage;

public class AccountPageTests extends BaseTest {

    @Test
    public void logoutTest(){
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
        homePage.clickGetToShoppingButton();
        homePage.clickAccountButton();

        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("Cristiana.Marian@endava.com")
                .enterPassword("Airplanemode23")
                .closeFreeShippingMessage();
        loginPage.clickSignInButton();

        AccountPage accountPage = new AccountPage();
        accountPage.clickLogoutButton();
    }
}
