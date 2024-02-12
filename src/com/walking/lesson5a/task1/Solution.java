package com.walking.lesson5a.task1;

/*
Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести
свое имя в консоль.

Вариант 1: не используя переменную типа String;

Вариант 2: предварительно собрав значения массива в переменную типа String.

Подсказка для варианта 2: создать пустую строку можно так: String s = “”;
 */
public class Solution {
    public static void main(String[] args) {
        char[] name = {'D', 'i', 'm', 'o', 'n'};
        // 1
        for(char ch : name) {
            System.out.print(ch);
        }
        System.out.println();

        // 2
        String name1 = new String(name);

        String name2 = String.valueOf(name);

        StringBuilder bl = new StringBuilder();
        bl.append(name);
        String name3 = bl.toString();

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }
}
