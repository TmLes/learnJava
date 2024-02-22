package test.test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

  public static void main(String[] args) {
    List<Runner> list = new ArrayList<>();
    List<Thread> threads = new ArrayList<>();

    // Подготовка списка бегунов
    doReady(list);

    // Перемешивание списка бегунов
    Collections.shuffle(list);

    // Пауза перед стартом
    goSleep();

    // Вывод списка бегунов
    showList(list);

    // Пауза перед стартом
    goSleep();

    // Старт забега
    doRace(list, threads);

    // Сортировка списка бегунов по времени
    list.sort(Comparator.comparingLong(Runner::getTime));

    // Пауза перед выводом результатов
    goSleep();

    // Вывод списка бегунов с результатами
    showList(list);

    // Пауза перед выбором победителей
    goSleep();

    // Выбор победителей
    list = getList(list, 5);

    // Изменение параметров бегунов
    changeSlowParam(list, 5);

    // Вывод списка победителей
    showList(list);

    // Перемешивание списка победителей
    Collections.shuffle(list);

    // Пауза перед стартом финала
    goSleep();

    // Старт финального забега
    doRace(list, threads);

    // Сортировка списка победителей по времени
    list.sort(Comparator.comparingLong(Runner::getTime));

    // Пауза перед выводом результатов финала
    goSleep();

    // Вывод списка победителей финала
    showList(list);

    // Вывод имени победителя
    System.out.println("Winner is " + list.get(0).getName());
  }

  // Подготовка списка бегунов
  private static void doReady(List<Runner> list) {
    for (int i = 0; i < 10; i++) {
      Runner r = new Runner();
      System.out.println(r.getName() + " is ready!");
      list.add(r);
    }
  }

  // Пауза
  private static void goSleep() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  // Вывод списка
  private static <T> void showList(List<T> list) {
    for (T t : list) {
      System.out.println(t);
    }
  }

  // Формирование списка победителей
  private static List<Runner> getList(List<Runner> list, int n) {
    return new ArrayList<>(list.subList(0, n));
  }

  // Изменение параметров бегунов
  private static void changeSlowParam(List<Runner> list, int n) {
    for (Runner runner : list) {
      runner.setSlowParam(n);
    }
  }

  // Старт забега
  private static void doRace(List<Runner> list, List<Thread> threads) {
    for (Runner runner : list) {
      Thread th = new Thread(runner::goRun);
      th.start();
      threads.add(th);
    }
    waitForThreads(threads);
    threads.clear();
  }

  // Ожидание завершения всех потоков
  private static void waitForThreads(List<Thread> threads) {
    for (Thread thread : threads) {
      try {
        thread.join(); // Ожидаем завершения всех потоков
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class Runner {

  private final int id;
  private final String name;
  private int slowParam;
  private long time = 0;

  public Runner() {
    this.id = ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE);
    this.name = "Runner(" + id + ")";
    this.slowParam = (ThreadLocalRandom.current().nextInt(1, 10) * 1000);
  }

  // Запуск бега
  public void goRun() {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 100; i++) {
      if (i % 10 == 0) {
        System.out.println(this.name + " in " + i + "m");
        try {
          Thread.sleep(slowParam);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
    System.out.println(this.name + " is finished!");
    long endTime = System.currentTimeMillis();
    time = endTime - startTime;
  }

  @Override
  public String toString() {
    return (
      "Runner [id=" +
      id +
      ", name=" +
      name +
      ", slowParam=" +
      slowParam +
      ", time=" +
      time +
      "]"
    );
  }

  // Установка значения slowParam
  public void setSlowParam(int n) {
    this.slowParam = (ThreadLocalRandom.current().nextInt(1, n) * 1000);
  }

  // Получение имени бегуна
  public String getName() {
    return name;
  }

  // Получение времени бегуна
  public long getTime() {
    return time;
  }
}
