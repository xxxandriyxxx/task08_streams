package com.epam.stream_string_app.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

    static long getNumOfUnique(List<String> list) {
        return list.stream()
                .distinct()
                .count();
    }

    static List<String> getSortedListOfUnique(List<String> list) {
        return list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    static Map<String, Long> getNumOfWords(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()));
    }

    static Map<String, Long> getNumOfSymbols(List<String> list) {
        List<String> symbolList = getSymbolList(list);
        return symbolList.stream()
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()));
    }

    private static List<String> getSymbolList(List<String> list) {
        return list.stream()
                .flatMap(e -> Stream.of(e.split("")))
                .collect(Collectors.toList());
    }
}
