package com.epam.stream_string_app.controller;

import java.util.List;
import java.util.Map;

public interface Controller {

    long getNumOfUnique(List<String> list);

    List<String> getSortedListOfUnique(List<String> list);

    Map<String, Long> getNumOfWords(List<String> list);

    Map<String, Long> getNumOfSymbols(List<String> list);
}
