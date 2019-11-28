package com.epam.pattern_command.model;

//command - according to the pattern Command
@FunctionalInterface
public interface Command {

    void execute(String arg);

}
