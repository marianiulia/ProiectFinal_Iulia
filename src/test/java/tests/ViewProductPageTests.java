package tests;

import org.junit.Test;
import screens.HomePage;
import screens.ViewProductPage;

public class ViewProductPageTests extends BaseTest{
    @Test
    public void addProductToCartTest(){
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
        homePage.clickGetToShoppingButton();

        homePage.scrollToProduct();
        homePage.clickOnProduct();

        ViewProductPage viewProductPage = new ViewProductPage();
        viewProductPage.addProductToCart();
    }
}
