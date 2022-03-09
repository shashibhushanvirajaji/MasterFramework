package com.home.driver.web.local;

import com.home.driver.manager.web.local.ChromeManager;
import com.home.driver.manager.web.local.FireFoxManager;
import com.home.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class LocalDriverFactory {

    private LocalDriverFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME,ChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX,FireFoxManager::getDriver);
    }
    public static  WebDriver getDriver(BrowserType browserType)
    {
       return MAP.get(browserType).get();
    }

}
