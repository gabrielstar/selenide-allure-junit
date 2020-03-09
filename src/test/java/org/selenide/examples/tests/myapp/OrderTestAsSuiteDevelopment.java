package org.selenide.examples.tests.myapp;

import io.qameta.allure.Step;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.selenide.examples.tests.StopOnFailureSuite;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderTestAsSuiteDevelopment extends OrderTestAsSuite{
    @Override
    @Test
    @Ignore
    public void t01_navigateToSearchPage() {
        super.t01_navigateToSearchPage();
    }

    @Override
    @Test
    @Ignore
    public void t02_searchForProducts() {
        super.t02_searchForProducts();
    }

    @Override
    public void t03_addProductToCart() {
        assert false;
        super.t03_addProductToCart();
        System.out.println("Development version of my exisiting step");
    }

}
