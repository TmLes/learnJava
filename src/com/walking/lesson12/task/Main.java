package com.walking.lesson12.task;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        CounterService service = CounterService.getInstance();
        Counter gas = new GasCounter("gas", service);
        Counter electric = new ElectricCounter("electric", service);
        Counter water = new WaterCounter("water", service);
        action(service);
    }

    private static void action(CounterService service) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choice the action, please:");
            System.out.println("1: Press 0 to exit.");
            System.out.println("2: Press 1 to show all counters.");
            System.out.println("3: Press 2 to set value of counter");
            System.out.println("4: Press 3 to set value to zero");
            System.out.println("5: Press 4 to show values of counters");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1 -> service.showAll();
                case 2 -> service.setValue();
                case 3 -> service.setValueToZero();
                case 4 -> show(service);
            }
        }
    }

    private static void show(CounterService service) {
        service.getCounters().forEach(counter -> System.out.println(counter.getNAME() + " : " + counter.getValue()));
    }
}

class CounterService {
    private static CounterService instance;
    private List<Counter> counters;

    private CounterService() {
        this.counters = new ArrayList<>();
    }

    public static CounterService getInstance() {
        if (instance == null) {
            instance = new CounterService();
        }
        return instance;
    }

    public void add(Counter counter) {
        counters.add(counter);
    }

    public void showAll() {
        counters.forEach(System.out::println);
    }

    public void setValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of counter to set value: ");
        String name = scanner.nextLine();
        System.out.print("Enter new value: ");
        int newValue = scanner.nextInt();
        counters.stream()
                .filter(counter -> counter.getNAME().equals(name))
                .findFirst()
                .ifPresent(counter -> counter.setValue(newValue));
    }

    public void setValueToZero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of counter to set value to zero: ");
        String name = scanner.nextLine();
        counters.stream()
                .filter(counter -> counter.getNAME().equals(name))
                .findFirst()
                .ifPresent(counter -> counter.setValue(0));
    }

    public List<Counter> getCounters() {
        return counters;
    }
}

abstract class Counter {
    protected final String NAME;
    protected int value;

    public Counter(String name, CounterService service) {
        this.NAME = name;
        this.value = 0;
        service.add(this);
    }

    public String getNAME() {
        return NAME;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Counter " + getNAME() + getValue();
    }
}

class ElectricCounter extends Counter {
    private final String UNIT = "kW_h";

    public ElectricCounter(String name, CounterService service) {
        super(name, service);
        Thread incrementThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        incrementThread.setDaemon(true);
        incrementThread.start();
    }

    public void increment() {
        this.value++;
    }

    public String getUNIT() {
        return UNIT;
    }

    @Override
    public String toString() {
        return super.toString() + getUNIT();
    }
}

class GasCounter extends Counter {
    private final String UNIT = "kW_h";

    public GasCounter(String name, CounterService service) {
        super(name, service);
        Thread incrementThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                    increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        incrementThread.setDaemon(true);
        incrementThread.start();
    }

    public void increment() {
        this.value++;
    }

    public String getUNIT() {
        return UNIT;
    }

    @Override
    public String toString() {
        return super.toString() + getUNIT();
    }
}

class WaterCounter extends Counter {
    private final String UNIT = "cub_m";

    public WaterCounter(String name, CounterService service) {
        super(name, service);
        Thread incrementThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(7000);
                    increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        incrementThread.setDaemon(true);
        incrementThread.start();
    }

    public void increment() {
        this.value++;
    }

    public String getUNIT() {
        return UNIT;
    }

    @Override
    public String toString() {
        return super.toString() + getUNIT();
    }
}


