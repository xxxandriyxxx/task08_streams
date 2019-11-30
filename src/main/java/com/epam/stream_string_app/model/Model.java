package com.epam.stream_string_app.model;

import java.util.List;
import java.util.Map;

public interface Model {

    long getNumOfUnique(List<String> list);

    List<String> getSortedListOfUnique(List<String> list);

    Map<String, Long> getNumberOfWords(List<String> list);

    Map<String, Long> getNumberOfSymbols(List<String> list);

}
