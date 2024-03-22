package com.hepsiburada.selectors.searchpageselectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPageSelectors {

    public SearchPageSelectors(WebDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

    @FindBy(xpath = "(//*[@resource-id=\"com.pozitron.hepsiburada:id/lytOptionBarFilters\"])[1]")
    public WebElement btnSearchFilter;
    @FindBy(xpath = "(//*[@resource-id=\"com.pozitron.hepsiburada:id/lyt_filter_container\"])[4]")
    public WebElement btnSearchFilterPrice;
    @FindBy(xpath = "(//*[@resource-id=\"com.pozitron.hepsiburada:id/editTextPriceMin\"])[1]")
    public WebElement txtSearchFilterPriceMin;
    @FindBy(xpath = "(//*[@resource-id=\"com.pozitron.hepsiburada:id/editTextPriceMax\"])[1]")
    public WebElement txtSearchFilterPriceMax;
    @FindBy(xpath = "(//*[@resource-id=\"com.pozitron.hepsiburada:id/btnFiltersApply\"])[1]")
    public WebElement btnSearchFilterPriceApply;
    @FindBy(xpath = "(//*[@resource-id=\"com.pozitron.hepsiburada:id/tvApplyFilterButton\"])[1]")
    public WebElement btnSearchFilterApply;
    @FindBy(xpath = "(//*[@resource-id='com.pozitron.hepsiburada:id/ivProduct'])")
    public List<WebElement> listSearch;
}