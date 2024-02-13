package com.walking.lesson6.task;
/*
Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа). Нарисовать в консоли заданный
прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “. Каждая единица длины должна
обозначаться одним символом “-“, каждая единица ширины – символом “|“.
 */

import java.util.Scanner;

public class Solution {

    private static String repeatString(String str, int count) {
        return str.repeat(Math.max(0, count));
    }

    private static void doSquare(int width, int height) {
        String horizontalLine = repeatString("-", width);

        System.out.println(horizontalLine);
        for (int i = 0; i < height; i++) {
            System.out.println("|" + repeatString(" ", width - 2) + "|");
        }
        System.out.println(horizontalLine);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input width: ");
        int width = scanner.nextInt();
        System.out.print("Input height: ");
        int height = scanner.nextInt();
        scanner.close();
        doSquare(width, height);
    }
}
