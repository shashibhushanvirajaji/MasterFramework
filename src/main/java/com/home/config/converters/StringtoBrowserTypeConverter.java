package com.home.config.converters;

import com.home.enums.BrowserType;
import org.aeonbits.owner.Converter;
import java.lang.reflect.Method;
import java.util.Map;

public class StringtoBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browsername) {
        Map<String,BrowserType> stringBrowserTypeMap = Map.of("CHROME", BrowserType.CHROME,
                "FIREFOX",BrowserType.FIREFOX);

        return stringBrowserTypeMap.getOrDefault(browsername.toUpperCase(),BrowserType.CHROME);
    }
}
