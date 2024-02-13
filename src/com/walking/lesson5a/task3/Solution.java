package com.walking.lesson5a.task3;
/*
Вычислить и записать в массив первые 10 простых чисел.

Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1.
1 не является простым числом.

Вывести в консоль сумму всех элементов полученного массива.
 */

import java.util.Arrays;

public class Solution {

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 0;
        int number = 0;
        while (count < 10) {
            if (isPrime(number)) {
                numbers[count] = number;
                count++;
            }
            number++;
        }
        int sum = Arrays.stream(numbers).
                sum();

        System.out.println(sum);
    }
}
