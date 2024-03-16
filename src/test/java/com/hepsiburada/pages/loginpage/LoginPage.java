package com.hepsiburada.pages.loginpage;

import com.hepsiburada.base.BaseTest;
import com.hepsiburada.base.ConfigHandler;
import com.hepsiburada.selectors.loginpageselectors.LoginPageSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.hepsiburada.pages.basepage.BasePage.*;


public class LoginPage extends BaseTest {

    private final LoginPageSelectors loginPageSelectors = new LoginPageSelectors(appiumDriver);

    public LoginPage(WebDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

    private static final ConfigHandler configReader = new ConfigHandler();


    public static String getEmailFromConfig() {
        return configReader.getConfigs(configReader.getEnvironment()).get("email");
    }

    public static String getPasswordFromConfig() {
        return configReader.getConfigs(configReader.getEnvironment()).get("password");
    }

    private final String configEmail = getEmailFromConfig();
    private final String configPassword = getPasswordFromConfig();

    public void clickLoginButton() {
        clickOn(loginPageSelectors.btnLoginLogin, 10);
    }

    public void clickLoginButtonVersionTwo() {
        clickOn(loginPageSelectors.btnLoginLoginVersionTwo, 10);
    }

    public void setLoginEmailPassword(String email, String password) {
        if (email.equals("config") && password.equals("config")) {
            email = configEmail;
            password = configPassword;
        }

        setText(loginPageSelectors.txtLoginEmail, 10, email);
        setText(loginPageSelectors.txtLoginPassword, 10, password);
        clickLoginButton();
    }

    public void setLoginEmailPasswordVersionTwo(String email, String password) {
        waitBySeconds(10);
        if (email.equals("config") && password.equals("config")) {
            email = configEmail;
            password = configPassword;
        }

        setText(loginPageSelectors.txtLoginEmailVersionTwo, 10, email);
        clickLoginButtonVersionTwo();
        waitBySeconds(10);
        setText(loginPageSelectors.txtLoginPasswordVersionTwo, 10, password);
        clickLoginButtonVersionTwo();
    }


}