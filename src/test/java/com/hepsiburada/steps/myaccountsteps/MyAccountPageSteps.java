package com.hepsiburada.steps.myaccountsteps;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.pages.myaccountpage.MyAccountPage;
import com.thoughtworks.gauge.Step;

public class MyAccountPageSteps extends BaseTest {
    private final MyAccountPage myAccountPage = new MyAccountPage(appiumDriver);

    @Step("Check that the My Account page appears")
    public void checkVisibilityMyOrdersButtonStep() {
        myAccountPage.checkVisibilityMyOrdersButton();
    }

    @Step("Click Login button on my account page")
    public void clickLoginButtonStep() {
        myAccountPage.clickLoginButton();
    }

    @Step("Check that the text in the namespace is <text>")
    public void checkVisibilityMyOrdersNameStep(String text) {
        myAccountPage.checkVisibilityMyOrdersName(text);
    }

}



