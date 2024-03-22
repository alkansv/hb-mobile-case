package com.hepsiburada.steps.searchpagesteps;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.pages.searchPage.SearchPage;
import com.thoughtworks.gauge.Step;

public class SearchPageSteps extends BaseTest {
    private final SearchPage searchPage = new SearchPage();

    @Step("Click Filter button")
    public void clickFilterButtonStep() {
        searchPage.clickFilterButton();
    }

    @Step("Click Price Range button")
    public void clickFilterPriceButtonStep() {
        searchPage.clickFilterPriceButton();
    }

    @Step("Set min to <min> in the price range field")
    public void setFilterPriceMinStep(String min) {
        searchPage.setFilterPriceMin(min);
    }

    @Step("Set max to <max> in the price range field")
    public void setFilterPriceMaxStep(String max) {
        searchPage.setFilterPriceMax(max);
    }

    @Step("Click Apply button for price")
    public void clickFilterPriceApplyStep() {
        searchPage.clickFilterPriceApply();
    }

    @Step("Click List Products button")
    public void clickFilterApplyStep() {
        searchPage.clickFilterApply();
    }

    @Step("Select random product")
    public void selectRandomProductStep() {
        searchPage.selectRandomProduct();
    }
}



