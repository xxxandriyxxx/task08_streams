package com.epam.pattern_command.model;

public class Print implements Command {

    private Receiver receiver;

    @Override
    public void execute(String arg) {
        receiver.Print(arg);
    }
    
}
