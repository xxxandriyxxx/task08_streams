package com.epam.stream;

import java.util.List;

public class Calculation {

    public static int getMin(List<Integer> list) {
//        return Collections.min(list);
        return list.stream().min(Integer::compare).get();
    }

    public static int getMax(List<Integer> list) {
//        return Collections.max(list);
        return list.stream().max(Integer::compare).get();
    }

    public static float getAverage(List<Integer> list) {
        return (float) getSum(list) / list.size();
    }

    public static int getSum(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }

    

}
