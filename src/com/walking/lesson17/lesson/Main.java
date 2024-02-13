package com.walking.lesson17.lesson;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] myArray = new int[3];

    try {
      // код возможного исключения
      myArray[4] = Integer.parseInt("abv"); // Выход за предел массива + Ошибка преобразования из строки в число
    } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
      // перехват исключения + какая-то логика
      e.printStackTrace();
      System.out.println("Error");
    } finally {
      // этот блок выполнится в любом случае
      System.out.println("Program closed!");
    }

    try {
      System.out.println("Enter your name, please");
      String name = scanner.nextLine();
      if (name.length() > 5) {
        throw new LengthException("Too long name", name.length());
      }
    } catch (LengthException e) {
      e.getMessage();
      System.out.println(e.getNumber());
    }
  }
}
