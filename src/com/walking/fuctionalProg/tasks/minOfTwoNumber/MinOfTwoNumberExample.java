package com.walking.fuctionalProg.tasks.minOfTwoNumber;

import java.util.function.BiFunction;

public class MinOfTwoNumberExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> function = (x, y) -> (x < y) ? x : y;
        System.out.println(function.apply(2,3));
    }
}
