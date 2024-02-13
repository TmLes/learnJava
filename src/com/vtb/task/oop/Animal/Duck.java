package com.vtb.task.oop.Animal;

public class Duck extends Birds {
    public static int countDuck;
    int capacity = 10;

    public Duck(String name, int age) {
        super(name, age);
        countDuck += 1;
    }

    public Duck() {
        countDuck += 1;
    }

    @Override
    public void run(int length) {
        if (length <= this.capacity) {
            System.out.println(this.name + " runs " + length + "m.");
        } else {
            System.out.println(this.name + " can run only " + (length - this.capacity) + "m and it is tired!");
        }
    }

    @Override
    public void swim(int length) {
        this.capacity += 80;
        if (length <= this.capacity) {
            System.out.println(this.name + " swims " + length + "m.");
        } else {
            System.out.println(this.name + " can swims only " + (length - this.capacity) + "m and it is tired!");
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
