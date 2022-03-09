package com.home.config.converters;

import com.home.enums.BrowserType;
import com.home.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringtoRunModeBrowserTypeConverter implements Converter<RunModeBrowserType> {
    @Override
    public RunModeBrowserType convert(Method method, String runMode) {
        return RunModeBrowserType.valueOf(runMode.toUpperCase());
    }
}
