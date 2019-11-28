package com.epam.pattern_command.model;

//invoker - according to the pattern Command
public class Invoker {

    private Command printCommand;

    public Invoker(Command printCommand) {
        this.printCommand = printCommand;
    }

    public void print(String arg) {
        printCommand.execute(arg);
    }
}
