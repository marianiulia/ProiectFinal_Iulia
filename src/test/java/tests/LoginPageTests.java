package tests;

import org.junit.Test;
import screens.HomePage;
import screens.LoginPage;

public class LoginPageTests extends BaseTest {

    @Test
    public void successfulLoginTest(){
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
        homePage.clickGetToShoppingButton();
        homePage.clickAccountButton();

        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("Cristiana.Marian@endava.com")
                .enterPassword("Airplanemode23")
                .closeFreeShippingMessage();
        loginPage.clickSignInButton();
    }

    @Test
    public void wrongPasswordLoginTest(){
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
        homePage.clickGetToShoppingButton();
        homePage.clickAccountButton();

        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("Cristiana.Marian@endava.com")
                .enterPassword("randompass")
                .closeFreeShippingMessage();
        loginPage.clickSignInButton();
        loginPage.checkWrongPasswordMessage("Incorrect email or password.");
    }


}
