package com.walking.lesson18.task.task3;

import java.util.Objects;

import com.walking.lesson18.task.task3.ValueNotFind.ValueNotFindException;
/*
 * Реализовать класс для работы с массивом. Разработать метод, производящий поиск значения в массиве. Если значение не найдено — выбрасывать исключение. Если найдено — возвращать его.
 */
class Service<T> {

  private final T[] array;

  public Service(T[] array) {
    this.array = array;
  }

  public T  findValue(T value) {
    for (T t : array) {
        if (Objects.equals(t, value)) {
            return t;
        }
    }
    throw new ValueNotFindException();
    }

}

public class Main {

  public static void main(String[] args) {
    Integer[] array = { 1, 2, 3, 4, 5 };
    Service<Integer> var1 = new Service<>(array);
    System.out.println(var1.findValue(27));
  }
}
