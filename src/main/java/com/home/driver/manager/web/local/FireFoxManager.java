package com.home.driver.manager.web.local;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxManager {
    private FireFoxManager(){}

    public static WebDriver getDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        return (new FirefoxDriver());
    }
}
