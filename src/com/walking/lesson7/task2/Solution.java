package com.walking.lesson7.task2;
/*
Реализовать методы «вычисления суммы» для всех примитивных типов, кроме void. Возвращать:

    Для числовых типов — тот же тип. Даже если это ведет к потере точности. При угрозе потери
    данных — выводить сообщение в консоль и возвращать текущий результат (для byte, short, int);
    Для boolean — определение истинности всех переданных параметров, принимая то, что их стоит
    объединять через логическое И;
    Для char — строку, полученную в результате конкатенации всех переданных параметров.

Количество параметров может быть любым. Используйте перегрузку — у всех методов должны быть
одинаковые названия.
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(sum((byte) 1, (byte) 5, (byte) 126));
        System.out.println(sum((short) 1, (short) 5, (short) 126));
    }

    private static byte sum(byte... arg) {
        byte result = 0;
        for (byte b : arg) {
            if (isBeyondLimit(Byte.MIN_VALUE, Byte.MAX_VALUE, result, b)) {
                System.out.println("Value overflow!");
                return result;
            }
            result += b;
        }
        return result;
    }

    private static short sum(short... arg) {
        short result = 0;
        for (short b : arg) {
            if (isBeyondLimit(Short.MIN_VALUE, Short.MAX_VALUE, result, b)) {
                System.out.println("Value overflow!");
                return result;
            }
            result += b;
        }
        return result;
    }

    static boolean isBeyondLimit(long minLimit, long maxLimit, long currentSum, long term) {
        long sum = currentSum + term;

        return sum < minLimit || sum > maxLimit;
    }
}
