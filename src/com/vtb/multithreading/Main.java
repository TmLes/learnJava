package com.vtb.multithreading;

import java.util.Random;

class SharedBuilder {
    static StringBuilder builder = new StringBuilder();

    public static StringBuilder getBuilder() {
        return builder;
    }
}

class SharedRandom {
    static Random random = new Random();

    public static Random getRandom() {
        return random;
    }
}

class TestThread extends Thread {

    public void run() {
        com.vtb.multithreading.Main.go("TestThread");
    }
}

class TestRunnable implements Runnable {

    public void run() {
        com.vtb.multithreading.Main.go("TestRunnable");
    }
}

public class Main {

    public static void go(String threadName) {
        SharedBuilder.getBuilder().setLength(0);
        for (int i = 0; i < 6; i++) {
            SharedBuilder.getBuilder().append(threadName).append(" is running to ").append(i).append("\n");
            System.out.println(SharedBuilder.getBuilder());
            try {
                Thread.sleep(SharedRandom.getRandom().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.printf("%s is finished\n", threadName);
    }

    public static void main(String[] args) {
        System.out.println("Start program");
        Thread threadExample = new TestThread();
        Thread runnableExample = new Thread(new TestRunnable());
        Thread anonymousClassExample = new Thread(() -> com.vtb.multithreading.Main.go("AnonymousThread"));
        Thread daemonExample = new Thread(() -> com.vtb.multithreading.Main.go("DaemonThread"));
        threadExample.start();
        runnableExample.start();
        anonymousClassExample.start();
        daemonExample.start();

        daemonExample.setDaemon(true);  // необязательный для завершения поток

        try {
            // Main не завершится пока эти потоки не закроются
            threadExample.join();
            runnableExample.join();
            anonymousClassExample.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End program");
    }
}
