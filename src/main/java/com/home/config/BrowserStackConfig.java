package com.home.config;

import com.home.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/browser-stack.properties"
})

public interface BrowserStackConfig extends Config {

    @Key("username")
    String userName();

    @Key("automatekey")
    String automateKey();

    @DefaultValue("https://${username}:${automatekey}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserstackURL();


}
