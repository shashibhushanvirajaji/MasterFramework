package com.home.driver.web.remote;

import com.home.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.home.driver.manager.web.remote.selenoid.SelenoidFireFoxManager;
import com.home.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {

    public static WebDriver getDriver(BrowserType browserType)
    {
        return browserType == BrowserType.CHROME ? SelenoidChromeManager.getDriver()
                : SelenoidFireFoxManager.getDriver();
    }
}
