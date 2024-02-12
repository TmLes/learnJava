package com.walking.lesson5.task;


public class Solution {
    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//        int number = Integer.parseInt(scanner.nextLine());
//        int s = scanner.nextInt();
//        System.out.println(doFactorial(number));
//        doSumFigure(s);
        doSquare(5, 5);
    }

    public static int doFactorial(int n) {
        // Ввести с клавиатуры целое число. Вывести в консоль его факториал.
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void doSumFigure(int s) {
        int digitSum = 0;

        while (s != 0) {
//            Последняя цифра числа == остаток от его деления на 10
            digitSum += s % 10;
//            Исключаем цифру, которую уже учли в сумме
            s /= 10;
        }

//        сумма цифр даже отрицательного числа должна быть положительна
        if (digitSum < 0) {
            digitSum *= -1;
        }

        System.out.println(digitSum);
    }

    public static void doSquare(int width, int height) {
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < height - 2; i++) {
            System.out.print("|");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
    }
}
