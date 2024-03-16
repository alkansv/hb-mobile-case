package com.hepsiburada.base;

import com.thoughtworks.gauge.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);
    protected static AppiumDriver<MobileElement> appiumDriver;
    public static boolean localAndroid = true;


    @BeforeScenario
    public void beforeScenario() throws MalformedURLException {
        if (localAndroid) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities
                    .setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
            desiredCapabilities
                    .setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
                            "com.pozitron.hepsiburada");
            desiredCapabilities
                    .setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
                            "com.hepsiburada.ui.startup.SplashActivity");
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            desiredCapabilities.setCapability("unicodeKeyboard", false);
            desiredCapabilities.setCapability("resetKeyboard", false);
            desiredCapabilities.setCapability("waitForQuiescence", false);
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            appiumDriver = new AndroidDriver<>(url, desiredCapabilities);
        }
    }

    @BeforeStep
    public void beforeStep(ExecutionContext executionContext) {
        LOGGER.info("Running step : " + executionContext.getCurrentStep().getDynamicText());
    }

    @AfterScenario
    public void afterScenario() {
        appiumDriver.quit();
    }

    @AfterStep
    public void afterStep(ExecutionContext executionContext) {
        if (executionContext.getCurrentStep().getIsFailing()) {
            LOGGER.info(executionContext.getCurrentStep().getErrorMessage());
            LOGGER.info(executionContext.getCurrentStep().getStackTrace());
        }
    }
}
