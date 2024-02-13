package com.walking.lesson7.task1;
/*
Написать программу, которая объединяет любое количество строк, объединяя их через пробел.
Реализацию конкатенации строк вынести в отдельный метод.
 */

public class Solution {
    public static void main(String[] args) {
        doConcatString("Hello", "My", "Friend");
    }

    private static void doConcatString(String...arg) {
        System.out.println(String.join(" ", arg));
    }
}
