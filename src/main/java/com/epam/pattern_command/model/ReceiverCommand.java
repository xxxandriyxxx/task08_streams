package com.epam.pattern_command.model;

public class ReceiverCommand implements Command {

    private Receiver receiver;

    public ReceiverCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String arg) {
        receiver.print(arg);
    }

}
