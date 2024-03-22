package com.hepsiburada.pages.myaccountpage;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.pages.basepage.BasePage;
import com.hepsiburada.selectors.myaccountselectors.MyAccountPageSelectors;
import org.junit.Assert;

import static com.hepsiburada.pages.basepage.BasePage.*;


public class MyAccountPage extends BaseTest {

    private final MyAccountPageSelectors myAccountPageSelectors = new MyAccountPageSelectors(appiumDriver);

    private final BasePage basePage = new BasePage();

    public void checkVisibilityMyOrdersButton() {
        findElementWait(myAccountPageSelectors.btnMyAccountMyOrders, 10);
        Assert.assertTrue(myAccountPageSelectors.btnMyAccountMyOrders.isDisplayed());
    }

    public void clickLoginButton() {
        clickOn(myAccountPageSelectors.btnMyAccountLogin, 10);
        waitBySeconds(5);
    }

    public void checkVisibilityMyOrdersName(String text) {
        findElementWait(myAccountPageSelectors.btnMyAccountName, 5);
        basePage.checkElementSameText(myAccountPageSelectors.btnMyAccountName, text);
    }
}