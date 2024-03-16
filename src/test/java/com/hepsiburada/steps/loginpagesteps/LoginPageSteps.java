package com.hepsiburada.steps.loginpagesteps;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.pages.basepage.BasePage;
import com.hepsiburada.pages.loginpage.LoginPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class LoginPageSteps extends BaseTest {
    private final LoginPage loginPage = new LoginPage(appiumDriver);
    private final BasePage basePage = new BasePage(appiumDriver);

    @Step("Login with <email> and <password>")
    public void setLoginEmailPasswordStep(String email, String password) {
        if (basePage.isElementPresent(By.xpath("//*[@resource-id='emailInput']//android.widget.EditText"))) {
            loginPage.setLoginEmailPassword(email, password);
        } else loginPage.setLoginEmailPasswordVersionTwo(email, password);
    }

}



