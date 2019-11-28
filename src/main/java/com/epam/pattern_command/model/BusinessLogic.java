package com.epam.pattern_command.model;

//client - according to the pattern Command
public class BusinessLogic implements Model {

    private Receiver receiver = new Receiver();
    private Command receiverCommand = new ReceiverCommand(receiver);
    private Invoker invoker = new Invoker(receiverCommand);

    @Override
    public void lambdaCommand(String arg) {
        Command command = msg -> invoker.print("Used a lambda function || message: " + msg);
        command.execute(arg);
    }

    @Override
    public void methodReferenceCommand(String arg) {
        Command command = invoker::print;
        command.execute("Used a method reference || message: " + arg);
    }

    @Override
    public void anonymousClassCommand(String arg) {
        Command command = new Command() {
            @Override
            public void execute(String arg) {
                invoker.print("Used an anonymous class || message: " + arg);
            }
        };
        command.execute(arg);
    }

    @Override
    public void objectCommand(String arg) {
        invoker.print("Used an object of command class || message: " + arg);
    }
}
