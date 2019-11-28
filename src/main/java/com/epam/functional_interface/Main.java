package com.epam.functional_interface;

public class Main {

    public static void main(String[] args) {

        MyFuncInterface maxLambda = (a, b, c) -> {
            if ((a > b) && (a > c)) {
                return a;
            } else if ((b > a) && (b > c)) {
                return b;
            } else {
                return c;
            }
        };

        MyFuncInterface averageLambda = (a, b, c) -> (a + b + c) / 3;
        
        System.out.println(maxLambda.method(10, 20, 30));
        System.out.println(maxLambda.method(30, 100, 20));
        System.out.println(averageLambda.method(10, 20, 30));
        System.out.println(averageLambda.method(30, 100, 20));
    }
}
