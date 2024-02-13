package com.walking.lesson5a.task2;

import java.util.Scanner;

/*
Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры.
Вывести на экран сумму каждого значения с предыдущим. Предыдущим значением для 0-го (нулевого) элемента
считать последнее значение массива.
 */
public class Solution {
    public static void main(String[] args) {
        // Создаем массив int из 5 элементов
        int[] array = new int[5];

        // Заполняем массив значениями, введенными с клавиатуры
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите значение для элемента " + i + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        // Выводим на экран сумму каждого значения с предыдущим
        System.out.println("Сумма каждого значения с предыдущим:");
        for (int i = 0; i < array.length; i++) {
            int previousIndex = (i == 0) ? array.length - 1 : i - 1;
            int sum = array[i] + array[previousIndex];
            System.out.println(array[i] + " + " + array[previousIndex] + " = " + sum);
        }
    }
}
