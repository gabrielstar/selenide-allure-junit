package org.selenide.examples.tests.myapp;

import org.junit.Test;
import org.selenide.examples.config.pages.myapp.*;

public class OrderTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    ResultsPage resultsPage = new ResultsPage();
    CartPage cartPage = new CartPage();

    @Test
    public void successfulOrderTest() {
        loginPage.login();
        mainPage.navigateToSearchPage();
        searchPage.searchForProducts();
        resultsPage.addProductToCart();
        mainPage.navigateToCartPage();
        cartPage.submitOrder();
        cartPage.validateOrder();
    }
}
