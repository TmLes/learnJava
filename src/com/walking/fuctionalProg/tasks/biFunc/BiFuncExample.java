package com.walking.fuctionalProg.tasks.biFunc;

public class BiFuncExample {
    public static void main(String[] args) {
        BinaryFunction<Integer, Integer, String> foo = (arg1, arg2) -> String.valueOf(arg1 + (arg2 - 16));
        String result = foo.apply(2, 5);
        System.out.println(result);
    }
}
