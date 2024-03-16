package com.hepsiburada.pages.myaccountpage;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.pages.basepage.BasePage;
import com.hepsiburada.selectors.myaccountselectors.MyAccountPageSelectors;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.hepsiburada.pages.basepage.BasePage.*;


public class MyAccountPage extends BaseTest {

    private final MyAccountPageSelectors myAccountPageSelectors = new MyAccountPageSelectors(appiumDriver);

    public MyAccountPage(WebDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

    private final BasePage basePage = new BasePage(appiumDriver);

    public void checkVisibilityMyOrdersButton() {
        findElementWait(myAccountPageSelectors.btnMyAccountMyOrders, 10);
        Assert.assertTrue(myAccountPageSelectors.btnMyAccountMyOrders.isDisplayed());
    }

    public void clickLoginButton() {
        clickOn(myAccountPageSelectors.btnMyAccountLogin, 10);
        waitBySeconds(10);
    }

    public void checkVisibilityMyOrdersName(String text) {
        findElementWait(myAccountPageSelectors.btnMyAccountName, 10);
        basePage.checkElementSameText(myAccountPageSelectors.btnMyAccountName, text);
    }
}