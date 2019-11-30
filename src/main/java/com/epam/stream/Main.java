package com.epam.stream;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = RandomIntList.getList1(20, 0, 100);
        System.out.println("------------------ method1:");
        System.out.println("List: " + list1.toString());

        List<Integer> list2 = RandomIntList.getList2(10, 0, 50);
        System.out.println("------------------ method2:");
        System.out.println("List: " + list2.toString());

        List<Integer> list3 = RandomIntList.getList2(5, 0, 10);
        System.out.println("------------------ calculation:");
        System.out.println("List: " + list3.toString());
        System.out.println("Min: " + Calculation.getMin(list3));
        System.out.println("Max: " + Calculation.getMax(list3));
        System.out.println("Average: " + Calculation.getAverage(list3));
        System.out.println("Sum: " + Calculation.getSum(list3));
        System.out.println("Number of values > average: " + Calculation.countBiggerAverage(list3));
    }

}
