package test.test4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Test4 {
    public static void main(String[] args) {
        List<Runner> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Runner());
        }

        for (Runner runner : list) {
            System.out.println(runner);
        }

        for (Runner runner : list) {
            runner.start();
        }

        for (Runner runner : list) {
            System.out.println(runner.timeFinish.toString());
        }
    }
}

class Runner extends Thread {
    int id;
    LocalDateTime timeFinish;
    int slowParam;

    public Runner() {
        this.id = (int) this.getId();
        this.slowParam = (ThreadLocalRandom.current().nextInt(1, 3) * 1000);
        this.setName("Runner(" + id + ")");
    }

    public String toString() {
        return "I`m " + this.getName() + " and I slowly on " + slowParam / 1000 + "sec.";
    }

    public void run() {
        System.out.println(this.getName() + " is ready!");
        for (int i = 0; i < 50; i++) {
            if(i % 10 == 0){
                System.out.println(this.getName() + " run " + i + "m.");
            }
            try {
                sleep(slowParam);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.timeFinish = LocalDateTime.now();
    }
}
