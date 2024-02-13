package com.walking.lesson18.lesson;

public class Main {

  public static void main(String[] args) {
    Accaunt<Integer> acc3 = new Accaunt<Integer>(1, 5000);
    Accaunt<String> acc2 = new Accaunt<String>("2", 10000);

    System.out.printf("Total: %d\n", acc3.getSum() + acc2.getSum());
    System.out.println(acc3.getId());
    System.out.println(acc2.getId());

    String[] animal = { "Cat", "Dog", "Bird" };
    Integer[] numbers = { 5, 4, 2, 3, 1 };

    print(animal);
    print(numbers);
  }

  public static <T> void print(T[] arg) {
    for (T t : arg) {
      System.out.println(t);
    }
  }
}
