package com.github.gregwhitaker.springshell.example;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultBannerProvider;
import org.springframework.shell.support.util.OsUtils;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ExampleBannerProvider extends DefaultBannerProvider {

    public String getBanner() {
        StringBuffer buf = new StringBuffer();
        buf.append(OsUtils.LINE_SEPARATOR);
        buf.append("****************************************" + OsUtils.LINE_SEPARATOR);
        buf.append("*            Example CLI               *" + OsUtils.LINE_SEPARATOR);
        buf.append("****************************************" + OsUtils.LINE_SEPARATOR);
        buf.append(OsUtils.LINE_SEPARATOR);
        return buf.toString();

    }

    public String getWelcomeMessage() {
        return "Welcome to the Example CLI";
    }

    @Override
    public String getProviderName() {
        return "ExampleBannerProvider";
    }

}
