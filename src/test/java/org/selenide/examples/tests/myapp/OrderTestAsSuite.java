package org.selenide.examples.tests.myapp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.selenide.examples.config.pages.myapp.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderTestAsSuite {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    ResultsPage resultsPage = new ResultsPage();
    CartPage cartPage = new CartPage();

    @Test
    public void t00_login() {
        loginPage.login();
    }

    @Test
    public void t01_navigateToSearchPage() {
        mainPage.navigateToSearchPage();

    }

    @Test
    public void t02_searchForProducts() {
        searchPage.searchForProducts();

    }

    @Test
    public void t03_addProductToCart() {
        resultsPage.addProductToCart();

    }

    @Test
    public void t04_navigateToCartPage() {
        mainPage.navigateToCartPage();

    }

    @Test
    public void t05_submitOrder() {
        cartPage.submitOrder();

    }

    @Test
    public void t06_validateOrder() {
        cartPage.validateOrder();

    }
}
