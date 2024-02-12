package com.walking.lesson4.task.task1;

import java.util.Scanner;

/*
Ввести с клавиатуры два целых числа. Если Число1 четное, вывести произведение двух чисел(пр.1)
если нет - частное(пр.2). Также если числа равны - вывести надпись "Числа равны!"
 */
public class Solution {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        if (num1 % 2 == 0) {
            System.out.printf("%.0f * %.0f = %.0f%n", num1, num2, num1 * num2);
        } else {
            System.out.printf("%.0f / %.0f = %.1f%n", num1, num2, num1 / num2);
        }
    }
}
