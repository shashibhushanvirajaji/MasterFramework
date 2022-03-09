package com.home.driver.web.remote;

import com.home.driver.manager.web.local.ChromeManager;
import com.home.driver.manager.web.local.FireFoxManager;
import com.home.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.home.driver.manager.web.remote.browserstack.BrowserStackFireFoxManager;
import com.home.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {

    private BrowserStackFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

//    public static WebDriver getDriver(BrowserType browserType)
//    {
//        return browserType == BrowserType.CHROME ? BrowserStackChromeManager.getDriver()
//                : BrowserStackFireFoxManager.getDriver();
//    }
    static {
        MAP.put(BrowserType.CHROME, BrowserStackChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, BrowserStackFireFoxManager::getDriver);
    }
    public static  WebDriver getDriver(BrowserType browserType)
    {
        return MAP.get(browserType).get();
    }

}
