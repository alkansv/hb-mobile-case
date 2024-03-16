package com.hepsiburada.pages.productdetailpage;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.selectors.productdetailpageselectors.ProductDetailPageSelectors;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.hepsiburada.pages.basepage.BasePage.findElementWait;


public class ProductDetailPage extends BaseTest {

    private final ProductDetailPageSelectors productDetailPageSelectors = new ProductDetailPageSelectors(appiumDriver);

    public ProductDetailPage(WebDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }


    public void checkVisibilityProductDetailAddBasket() {
        findElementWait(productDetailPageSelectors.btnProductDetailAddBasket, 10);
        Assert.assertTrue(productDetailPageSelectors.btnProductDetailAddBasket.isDisplayed());
    }

}