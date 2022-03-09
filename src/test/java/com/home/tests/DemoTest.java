package com.home.tests;

import com.home.config.BrowserStackConfigFactory;
import com.home.config.ConfigFactory;
import com.home.config.FrameworkConfig;
import com.home.driver.web.remote.BrowserStackFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testLogin()
    {
//        FrameworkConfig config = ConfigCache.getOrCreate(FrameworkConfig.class);
//                //ConfigFactory.create(FrameworkConfig.class);
//
//        System.out.println(config.browser());
        //System.out.println(ConfigFactory.getConfig().browser());
        System.out.println(BrowserStackConfigFactory.getConfig().browserstackURL());

    }
}
