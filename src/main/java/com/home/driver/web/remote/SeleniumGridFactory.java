package com.home.driver.web.remote;

import com.home.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.home.driver.manager.web.remote.selenium.SeleniumGridFireFoxManager;
import com.home.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class SeleniumGridFactory {

    private SeleniumGridFactory(){
    }

    public static WebDriver getDriver(BrowserType browserType)
    {
        return browserType == BrowserType.CHROME ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFireFoxManager.getDriver();

    }
}
