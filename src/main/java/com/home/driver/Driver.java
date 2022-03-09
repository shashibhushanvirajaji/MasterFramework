package com.home.driver;

import com.home.config.ConfigFactory;
import com.home.driver.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

     public static void initDriver()  // to run tests on local
    {
        WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        driver.get("https://google.co.in");

    }
    public static void quitDriver()
    {
       // driver.quit();
    }
}
