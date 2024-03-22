package com.hepsiburada.selectors.myaccountselectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageSelectors {

    public MyAccountPageSelectors(WebDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"account_menu_button_1\"]")
    public WebElement btnMyAccountLogin;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"account_menu_3\"]")
    public WebElement btnMyAccountMyOrders;
    @FindBy(xpath = "//*[@resource-id=\"com.pozitron.hepsiburada:id/tvUserNameFull\"]")
    public WebElement btnMyAccountName;
}