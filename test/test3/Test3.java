package test.test3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Test3 {
    public static void main(String[] args) {
        List<Runner> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Runner());
        }
        Collections.shuffle(list);
        for (Runner runner : list) {
            System.out.println(runner);
        }
    }
}

class Runner {
    static int count = 1;
    int id;
    String name;
    LocalDateTime timeFinish;
    int slowParam;

    public Runner() {
        this.id = count++;
        this.name = "Runner(" + id + ")";
        this.slowParam = (ThreadLocalRandom.current().nextInt(1, 10) * 1000);
    }

    public String toString() {
        return "I`m " + name + " and I slowly on " + slowParam / 1000 + "sec.";
    }
}
