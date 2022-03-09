package com.home.config;

import com.home.config.converters.StringToURLConverter;
import com.home.config.converters.StringtoBrowserTypeConverter;
import com.home.enums.BrowserRemoteModeType;
import com.home.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;
import com.home.enums.BrowserType;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("chrome")
    @ConverterClass(StringtoBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType runModeForBrowser();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();


}
