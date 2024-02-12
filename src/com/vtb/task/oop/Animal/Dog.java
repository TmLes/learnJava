package com.vtb.task.oop.Animal;

public class Dog extends Animal {
    public static int countDog;
    int capacity = 80;

    public Dog(String name, int age) {
        super(name, age);
        countDog += 1;
    }

    public Dog() {
        countDog += 1;
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
        if (length <= this.capacity) {
            System.out.println(this.name + " swims " + length + "m.");
        } else {
            System.out.println(this.name + " can swim only " + (length - this.capacity) + "m and it is tired!");
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
