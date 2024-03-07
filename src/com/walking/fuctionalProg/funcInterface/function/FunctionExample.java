package com.walking.fuctionalProg.funcInterface.function;

import java.util.function.Function;

/*
* public interface Function<T, R> {
*   R apply(T t);
* }
* Принимает один параметр T и возвращает R
* */


public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> length = String::length;
        Function<Integer, String> evenOdd = x -> (x % 2 == 0) ? "Even" : "Odd";
        Function<String, String> combo = length.andThen(evenOdd);
        String result = combo.apply("Hello");
        System.out.println(result);
    }
}
