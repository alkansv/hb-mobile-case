package com.hepsiburada.steps.productdetailpagesteps;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.pages.productdetailpage.ProductDetailPage;
import com.thoughtworks.gauge.Step;

public class ProductDetailPageSteps extends BaseTest {
    private final ProductDetailPage productDetailPage = new ProductDetailPage();

    @Step("Check that the Add to Cart button appears")
    public void checkVisibilityProductDetailAddBasketStep() {
        productDetailPage.checkVisibilityProductDetailAddBasket();
    }
}



