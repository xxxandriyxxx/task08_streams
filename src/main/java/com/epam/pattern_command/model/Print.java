package com.epam.pattern_command.model;

public class Print implements Command {

    private Receiver receiver;

    public Print(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String arg) {
        receiver.Print(arg);
    }

}
