package com.hepsiburada.pages.searchPage;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.pages.basepage.BasePage;
import com.hepsiburada.selectors.searchpageselectors.SearchPageSelectors;

import static com.hepsiburada.pages.basepage.BasePage.*;


public class SearchPage extends BaseTest {

    private final SearchPageSelectors searchPageSelectors = new SearchPageSelectors(appiumDriver);

    private final BasePage basePage = new BasePage();

    public void clickFilterButton() {
        clickOn(searchPageSelectors.btnSearchFilter, 10);
    }

    public void clickFilterPriceButton() {
        clickOn(searchPageSelectors.btnSearchFilterPrice, 10);
    }

    public void setFilterPriceMin(String min) {
        setText(searchPageSelectors.txtSearchFilterPriceMin, 10, min);
    }

    public void setFilterPriceMax(String max) {
        setText(searchPageSelectors.txtSearchFilterPriceMax, 10, max);
    }

    public void clickFilterPriceApply() {
        clickOn(searchPageSelectors.btnSearchFilterPriceApply, 10);
    }

    public void clickFilterApply() {
        clickOn(searchPageSelectors.btnSearchFilterApply, 10);
    }

    public void selectRandomProduct() {
        waitBySeconds(3);
        findElementWait(searchPageSelectors.listSearch.get(0), 5);
        int productNumber = basePage.randomNumber(1, 5);
        clickOn(searchPageSelectors.listSearch.get(productNumber), 5);
    }
}