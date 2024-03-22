package com.hepsiburada.selectors.loginpageselectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSelectors {

    public LoginPageSelectors(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@resource-id='emailInput']//android.widget.EditText")
    public WebElement txtLoginEmail;
    @FindBy(xpath = "//*[@resource-id='passwordInput']//android.widget.EditText")
    public WebElement txtLoginPassword;
    @FindBy(xpath = "//*[@resource-id='loginButton']")
    public WebElement btnLoginLogin;
    @FindBy(xpath = ".//*[@class='android.widget.EditText']")
    public WebElement txtLoginEmailVersionTwo;
    @FindBy(xpath = ".//*[@class='android.widget.EditText']")
    public WebElement txtLoginPasswordVersionTwo;
    @FindBy(xpath = ".//*[@class='android.widget.Button']")
    public WebElement btnLoginLoginVersionTwo;
}