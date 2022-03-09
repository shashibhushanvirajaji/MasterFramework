package com.home.driver.web.remote;

import com.home.enums.BrowserRemoteModeType;
import com.home.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    private static final Map<BrowserRemoteModeType, Function<BrowserType,WebDriver>> MAP =
            new EnumMap<>(BrowserRemoteModeType.class);

    private static final Function<BrowserType,WebDriver> Selenium = browserType -> SeleniumGridFactory.getDriver(browserType);
    private static final Function<BrowserType,WebDriver> Selenoid = browserType -> SelenoidFactory.getDriver(browserType);
    private static final Function<BrowserType,WebDriver> BrowserStack = browserType -> BrowserStackFactory.getDriver(browserType);

    static {
        MAP.put(BrowserRemoteModeType.SELENIUM,Selenium);
        MAP.put(BrowserRemoteModeType.SELENIOD,Selenoid);
        MAP.put(BrowserRemoteModeType.BROWSERSTACK,BrowserStack);
    }
    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType)
    {
        return MAP.get(browserRemoteModeType).apply(browserType);
    }
}
