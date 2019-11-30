package com.epam.stream_string_app.controller;

import com.epam.stream_string_app.model.BusinessLogic;
import com.epam.stream_string_app.model.Model;

import java.util.List;
import java.util.Map;

public class ControllerImpl implements Controller {

    private Model model;

    public ControllerImpl() {
        model = new BusinessLogic();
    }

    @Override
    public long getNumOfUnique(List<String> list) {
        return model.getNumOfUnique(list);
    }

    @Override
    public List<String> getSortedListOfUnique(List<String> list) {
        return model.getSortedListOfUnique(list);
    }

    @Override
    public Map<String, Long> getNumOfWords(List<String> list) {
        return model.getNumOfWords(list);
    }

    @Override
    public Map<String, Long> getNumOfSymbols(List<String> list) {
        return model.getNumOfSymbols(list);
    }
}
