package test.test2;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Test2 {

  public static void main(String[] args) {
    // Создание списка бегунов
    ArrayList<Runner> runners = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      runners.add(new Runner());
    }

    // Создание и запуск потоков для каждого бегуна
    ArrayList<Thread> threads = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Runner r = runners.get(i);
      Thread thread = new Thread(r);
      thread.setName(Integer.toString(r.id)); // Установка имени потока
      System.out.println(r.id + " is ready!");
      threads.add(thread);
    }
    for (Thread th : threads) {
        th.start();
    }

    // Ожидание завершения первого потока
    for (Thread thread : threads) {
      try {
        thread.join(); // Ожидание завершения потока
        System.out.println("Runner " + thread.getName() + " finished!"); // Вывод информации о завершении потока
        // break; // Выход из цикла после завершения первого потока
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class Runner implements Runnable {

  static int count = 1;
  int id;
  int slowly;

  public Runner() {
    this.id = count++;
    this.slowly = ThreadLocalRandom.current().nextInt(1000, 5000);
  }

  @Override
  public void run() {
    System.out.println("Runner " + id + " starts!");
    for (int i = 0; i < 101; i++) {
      if (i % 10 == 0) {
        System.out.println("Runner " + id + " run " + i + "m");
        try {
          Thread.sleep(slowly); // Замедление потока
        } catch (InterruptedException e) {
          System.out.println(e.getMessage());
        }
      }
    }
  }

  @Override
  public String toString() {
    return "Runner [id=" + id + ", slowly=" + slowly + "]";
  }
}
