package test.test1;

public class Test1 {

  public static void main(String[] args) {
    Mover m1 = new Mover("m1");
    Mover m2 = new Mover("m2");

    Thread thread1 = new Thread(() -> {
      try {
        m1.run();
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    });
    Thread thread2 = new Thread(() -> {
      try {
        m2.run();
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    });

    Thread thread3 = new Thread(() -> {
      thread1.start();
      thread2.start();

      try {
        thread1.join();
        System.out.println(m1.name + " finished!");
      } catch (Exception e) {
        // TODO: handle exception
      }
      try {
        thread2.join();
        System.out.println(m2.name + " finished!");
      } catch (Exception e) {
        // TODO: handle exception
      }
    });
    thread3.start();
  }
}

class Mover {

  String name;

  public Mover(String name) {
    this.name = name;
  }

  public void run() throws InterruptedException {
    for (int i = 0; i < 100; i++) {
      if (i % 10 == 0) {
        System.out.println("Mover " + name + " run " + i + "m!");
      }
    }
    System.out.println("Mover finished");
  }
}
