package com.walking.lesson18.task.task1;

/*
 * Создать обобщенный тип, принимающий в себя любого из наследников Number. Создать метод, возводящий значение параметризованного типа в степень, переданную параметром в метод.
 */

class Test<T extends Number> {

  T value;

  public Test(T value) {
    this.value = value;
  }

  public void getPow(double number) {
    System.out.println(Math.pow(value.doubleValue(), number));
  }
}

public class Main {

  public static void main(String[] args) {
    Test<Integer> test = new Test<>(5);
    test.getPow(2);
  }
}
