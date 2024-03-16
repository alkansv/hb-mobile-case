package com.hepsiburada.pages.basepage;

import com.hepsiburada.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;

public class BasePage extends BaseTest {

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final long ONE_SECOND = 1000L;

    public static void waitBySeconds(int seconds) {
        try {
            Thread.sleep(seconds * ONE_SECOND);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AssertionError(e);
        }
    }

    public static void setText(WebElement element, int timeout, String text) {
        new WebDriverWait(appiumDriver, timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public static void clickOn(WebElement element, int timeout) {
        new WebDriverWait(appiumDriver, timeout).until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public static void findElementWait(WebElement element, int timeout) {
        new WebDriverWait(appiumDriver, timeout).until(ExpectedConditions.visibilityOf(element));
        element.isDisplayed();
    }

    public void checkElementSameText(WebElement element, String expectedText) {
        Assert.assertEquals("Values are not the same", element.getText(), expectedText);
    }

    public boolean isElementPresent(By by) {
        try {
            appiumDriver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public int randomNumber(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }
}
