package com.hepsiburada.selectors.mainpageselectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageSelectors {

    WebDriver appiumDriver;

    public MainPageSelectors(WebDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(appiumDriver, this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Ana Sayfam\"]")
    public WebElement btnMainMainPage;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Hesabım\"]")
    public WebElement btnMainMyAccount;
    @FindBy(xpath = "(//*[@resource-id='com.pozitron.hepsiburada:id/composeView'])[1]//android.view.View/android.view.View[2]")
    public WebElement btnMainAllCategories;
    @FindBy(xpath = "//*[@resource-id=\"com.pozitron.hepsiburada:id/etSearchBox\"]")
    public WebElement txtMainSearchBox;
    @FindBy(xpath = "(//*[@resource-id=\"com.pozitron.hepsiburada:id/search_suggestion\"])[1]")
    public WebElement btnMainSearchListFirstLine;
}