package com.epam.stream_string_app.model;

import java.util.List;
import java.util.Map;

public class BusinessLogic implements Model {

    @Override
    public long getNumOfUnique(List<String> list) {
        return StreamOperation.getNumOfUnique(list);
    }

    @Override
    public List<String> getSortedListOfUnique(List<String> list) {
        return StreamOperation.getSortedListOfUnique(list);
    }

    @Override
    public Map<String, Long> getNumberOfWords(List<String> list) {
        return StreamOperation.getNumberOfWords(list);
    }

    @Override
    public Map<String, Long> getNumberOfSymbols(List<String> list) {
        return StreamOperation.getNumberOfSymbols(list);
    }
}
