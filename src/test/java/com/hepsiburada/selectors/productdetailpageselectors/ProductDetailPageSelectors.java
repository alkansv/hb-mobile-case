package com.hepsiburada.selectors.productdetailpageselectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPageSelectors {

    WebDriver appiumDriver;

    public ProductDetailPageSelectors(WebDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(appiumDriver, this);
    }

    @FindBy(xpath = "//*[@resource-id='com.pozitron.hepsiburada:id/product_detail_add_to_cart']")
    public WebElement btnProductDetailAddBasket;
}