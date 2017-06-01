package com.github.gregwhitaker.springshell.example.commands;

import com.github.gregwhitaker.springshell.example.echo.EchoServer;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

@Component
public class ShellCommands implements CommandMarker {

    @CliAvailabilityIndicator({ "echo" })
    public boolean isEchoAvailable() {
        return true;
    }

    @CliCommand(value = "echo", help = "echos the message")
    public String echo(@CliOption(key = { "message" }, mandatory = true, help = "message to echo") final String message) {
        return EchoServer.echo(message);
    }
}
