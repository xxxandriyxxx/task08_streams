package com.epam.pattern_command.controller;

import com.epam.pattern_command.model.BusinessLogic;
import com.epam.pattern_command.model.Model;

public class ControllerImpl implements Controller {

    private Model model;

    public ControllerImpl() {
        this.model = new BusinessLogic();
    }

    @Override
    public void lambdaCommand(String arg) {
        model.lambdaCommand(arg);
    }

    @Override
    public void methodReferenceCommand(String arg) {
        model.methodReferenceCommand(arg);
    }

    @Override
    public void anonymousClassCommand(String arg) {
        model.anonymousClassCommand(arg);
    }

    @Override
    public void objectCommand(String arg) {
        model.objectCommand(arg);
    }
}
