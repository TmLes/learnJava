package com.walking.lesson7.task3;
/*
Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println(doFactorial(number));
    }

    private static int doFactorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * doFactorial(num - 1);
        }
    }
}
