package com.github.gregwhitaker.springshell.example;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultPromptProvider;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ExamplePromptProvider extends DefaultPromptProvider {

    @Override
    public String getPrompt() {
        return "example-shell> ";
    }

    @Override
    public String getProviderName() {
        return "ExampleShellPrompt";
    }

}
