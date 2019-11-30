package com.epam.stream_list;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomIntList {

    public static List<Integer> getList1(int size, int min, int max) {
        List<Integer> list = new ArrayList<>();
        Stream.generate(() -> (int) (min + (Math.random() * (max - min + 1))))
                .limit(size)
                .forEach(list::add);
        return list;
    }

    public static List<Integer> getList2(int size, int min, int max) {
        return new Random().ints(min, max)
                .limit(size)
                .boxed()
                .collect(Collectors.toList());
    }

}
