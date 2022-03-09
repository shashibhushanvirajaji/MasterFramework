package com.home.config.converters;

import com.home.enums.BrowserRemoteModeType;
import com.home.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringtoRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType> {
    @Override
    public BrowserRemoteModeType convert(Method method, String remoteMode) {
        return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}
