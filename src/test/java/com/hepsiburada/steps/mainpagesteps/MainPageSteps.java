package com.hepsiburada.steps.mainpagesteps;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.pages.mainPage.MainPage;
import com.thoughtworks.gauge.Step;

public class MainPageSteps extends BaseTest {
    private final MainPage mainPage = new MainPage(appiumDriver);

    @Step("Click My Account button")
    public void clickMyAccountStep() {
        mainPage.clickMyAccount();
    }

    @Step("Click Main Page button")
    public void clickMainPageStep() {
        mainPage.clickMainPage();
    }

    @Step("Click All Categories button")
    public void clickMainAllCategoriesStep() {
        mainPage.clickMainAllCategories();
    }

    @Step("Set <product> to search box")
    public void setSearchBoxStep(String product) {
        mainPage.setSearchBox(product);
    }

}



