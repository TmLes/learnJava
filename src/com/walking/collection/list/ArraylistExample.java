package com.walking.collection.list;

/*
 * Реализации интерфейса List<T>
 *      ArrayList<T> - непотокобезопасный
 *      Vector<T> - потокобезопасный(Legasy)
 *      CopyOnWriteArrayList<T> - потокобезопасный (java.util.concurrent)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistExample {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(
      Arrays.asList(1, 2, 3, 5, 7, 9, 5, 2, 0, 4)
    );
    list.add(2); // Добавить
    System.out.println(list.size()); // размер
    System.out.println(list.isEmpty()); // пустой или нет
    System.out.println(list.contains(3)); // содержит ли такое значение
    System.out.println(list.get(2)); // получить элемент по индексу
    list.set(2, 15); // установить элемент по индексу

    list.sort((x, y) -> x - y); // сортировка (тут по возрастанию)
    list.removeIf(x -> x % 2 == 0); // удалить если
    removedAll(list, 5); // пример удаления значения в цикле
    ((ArrayList<Integer>) list).trimToSize();  // освободить лишнее пустое место
    showList(list); // обход
  }

  public static <T> void showList(List<T> list) {
    System.out.println();
    for (T o : list) {
      System.out.print(o);
    }
    System.out.println();
  }

  public static <T> void removedAll(List<T> list, T value) {
    while (list.remove(value));
  }
}
