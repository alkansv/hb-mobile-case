package com.hepsiburada.pages.mainPage;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.selectors.mainpageselectors.MainPageSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.hepsiburada.pages.basepage.BasePage.clickOn;
import static com.hepsiburada.pages.basepage.BasePage.setText;


public class MainPage extends BaseTest {

    private final MainPageSelectors mainPageSelectors = new MainPageSelectors(appiumDriver);

    public MainPage(WebDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }


    public void clickMyAccount() {
        clickOn(mainPageSelectors.btnMainMyAccount, 10);
    }

    public void clickMainPage() {
        clickOn(mainPageSelectors.btnMainMainPage, 10);
    }

    public void clickMainAllCategories() {
        clickOn(mainPageSelectors.btnMainAllCategories, 10);
    }

    public void setSearchBox(String product) {
        clickOn(mainPageSelectors.txtMainSearchBox, 10);
        setText(mainPageSelectors.txtMainSearchBox, 10, product);
        clickOn(mainPageSelectors.btnMainSearchListFirstLine, 10);
    }
}